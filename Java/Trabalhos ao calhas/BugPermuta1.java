import java.util.Random;
import java.util.Scanner;

/**
 * Pede um vector ao utilizador e imprime uma permutacao aleatoria do mesmo
 */
public class BugPermuta1 {

	public static void main(String[] args) {
		// Pede ao utilizador os numeros
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva uma sequencia de numeros separados por espacos:");
		String lido = sc.nextLine();
		sc.close();

		// Cria um vector com os numeros
		String[] numeros = lido.split("");
		int[] nums = new int[numeros.length/2+1];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(numeros[i*2]);   
        }

		// Faz a permuta
		permutar(nums);

		// Imprime o resultado
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}

	/**
	 * Faz permutacoes aleatorias num vector
	 * 
	 * @param vector O vector que vai ser permutado
	 */
	public static void permutar(int[] vector) {
		Random rnd = new Random();
		for (int i = vector.length-1; i > -1; i--) {
			int index = rnd.nextInt(i+1);
			// Troca o indice index com o indice i
			int a = vector[i];
			vector[i] = vector[index];
			vector[index] = a;
		}
	}
}
