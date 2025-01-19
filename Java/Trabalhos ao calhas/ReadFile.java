import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFile {

    public static void main(String[] args) {
      String fileName = "Ficheiro.txt";
      Scanner inputFile = null;

      try {
        inputFile = new Scanner(new File(fileName));
        String primeiraLinha = inputFile.nextLine();
        String segundaLinha = inputFile.nextLine();
        System.out.println(primeiraLinha);
        System.out.println(segundaLinha);

      }catch(FileNotFoundException e) {
        System.err.println("O ficheiro nao foi encontrado.");
      }
      catch(Exception e) {
        System.err.println("Erro ao ler o ficheiro");
      }
      finally {
        System.out.println("End of program.");
        if(inputFile != null)
          inputFile.close();
      }
    }
}
