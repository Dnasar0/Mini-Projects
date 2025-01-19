import java.io.*;

public class PP514 {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        File f1 = new File(args[0]);// OUTFILE
        File f2 = new File(args[1]);// INPUT

        FileReader fR1 = new FileReader(f1);
        FileReader fR2 = new FileReader(f2);

        BufferedReader reader1 = new BufferedReader(fR1);
        BufferedReader reader2 = new BufferedReader(fR2);

        String line1 = null;
        String line2 = null;
        int flag = 1;
        while ((flag == 1) && ((line1 = reader1.readLine()) != null)
                && ((line2 = reader2.readLine()) != null)) {
            if (!line1.equalsIgnoreCase(line2))
                flag = 0;
        }
        reader1.close();
        reader2.close();
        System.out.println("Flag " + flag);
    }
}
