import java.io.PrintWriter;
import java.time.LocalDate;
import java.io.FileNotFoundException;

public class WriteFile {

  public static void main(String[] args) {
    PrintWriter outputFile = null;

    try {
      outputFile = new PrintWriter("Ficheiro.txt");
    }catch(FileNotFoundException e) {
      System.err.println("Nao foi encontrado o ficheiro");
      System.exit(-1);
    }

    outputFile.print("Ficheiro escrito por java.");
    outputFile.println(2022);
    outputFile.print("Date: " + LocalDate.now());
    outputFile.close();
  }
}
