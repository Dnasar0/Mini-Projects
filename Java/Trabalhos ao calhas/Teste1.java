import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Teste1 {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("teste.txt"));
        int tamanho = sc.nextInt();
        sc.nextLine();
        String[] v = sc.nextLine().split(" ");
        int[] n = new int[tamanho];
        System.out.println(tamanho);
        System.out.println(Arrays.toString(v));
    }
}
