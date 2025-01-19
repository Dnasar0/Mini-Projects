import java.io.*; 
import java.net.*; 

// Server class 
class Server { 

    public static int numCli = 0;
    public static int IDCli = 0;

	public static void main(String[] args)  { 

		ServerSocket server = null; 

		try { 

			// server is listening on port 1234 
			server = new ServerSocket(1234); 
			server.setReuseAddress(true); 

			// running infinite loop for getting 
			// client request 
			while (true) { 

                System.out.println("Server started, waiting for connection...");

				// socket object to receive incoming client 
				// requests 
				Socket client = server.accept(); 

                synchronized (Server.class) {

                    numCli++;

                    IDCli++;

                }

				// Displaying that new client is connected 
				// to server 
				System.out.println("New client with ID (" + IDCli + ") connected: " + client.getInetAddress().getHostAddress() + " at port: " + client.getPort()); 

				// create a new thread object 
				ClientHandler clientSock = new ClientHandler(client); 

				// This thread will handle the client 
				// separately 
				new Thread(clientSock).start();
                
			} 
		} 
		catch (IOException e) { 
			e.printStackTrace(); 
		} 

		finally { 

			if (server != null) { 

				try {     
					server.close(); 
				} 
				catch (IOException e) { 
					e.printStackTrace(); 
				} 
			} 
		} 
	} 

	// ClientHandler class 
	private static class ClientHandler implements Runnable { 
		private final Socket clientSocket; 

		// Constructor 
		public ClientHandler(Socket socket) { 
			this.clientSocket = socket; 
		} 

		public void run() 
		{ 
			
			System.out.println("Number of current clients: " + numCli);
			PrintWriter out = null; 
			BufferedReader in = null; 
			try { 
					
				// get the outputstream of client 
				out = new PrintWriter(clientSocket.getOutputStream(), true); 

				// get the inputstream of client 
				in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

				String line; 
				while ((line = in.readLine()) != null) { 

					// writing the received message from 
					// client 
					System.out.printf(" Sent from the client " + IDCli + ":%s\n", line); 
					out.println(line); 
				} 
			} 
			catch (IOException e) { 
				e.printStackTrace(); 
			} 
			finally { 
				try { 
					if (out != null) { 
						out.close(); 
					} 
					if (in != null) { 
						in.close(); 
						clientSocket.close(); 
					} 
				} 
				catch (IOException e) { 
					e.printStackTrace(); 
				}

                synchronized (Server.class) {

                    numCli--;

                }

                System.out.println("Bye bye!");
			} 
		} 
	} 

    public static int getIDCli() {

        return IDCli;
    }
}
