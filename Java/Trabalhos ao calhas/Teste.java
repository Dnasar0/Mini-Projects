
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;

public class Teste {

	public static final double ERRO = 0.0;
	/**
	 * Ler vetor de inteiros e uma potencia e imprimir os valores das potencias dos
	 * inteiros
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc = null;
		try {
			sc = new Scanner(new File("teste.txt"));
			int tamanho = lerTamanhoVetor(sc);
			int[] inteiros = lerInteirosVetor(sc, tamanho);
			double potencia = lerValorPotencia(sc);
			if(potencia < ERRO) {
				throw new IllegalArgumentException("Ocorreu um erro. A potencia eh negativa");
			}
			double[] calculados = calculaPotencias(inteiros, potencia);
			imprimirVetor(calculados);
		}catch(FileNotFoundException e) {
			if(e.getMessage() == null) {
				System.err.println("Ocorreu um erro. Ficheiro nao encontrado.");
			}
			else {
				System.out.println(e.getMessage());
			}
		}
		catch(InputMismatchException e) {
			if(e.getMessage() == null) {
			System.err.println("Ocorreu um erro.\n" + "Uma linha do ficheiro nao eh um inteiro.");
			}
			else {
				System.out.println(e.getMessage());
			}
		}
		catch(ArithmeticException e) {
			if(e.getMessage() == null) {
				System.err.println("Ocorreu um erro. Um valor do vetor calculado nao eh um numero valido.");	
			}
			else {
				System.out.println(e.getMessage());
			}
		}
		sc.close();
	}

	/**
	 * Ler e devolver o tamanho do vetor original
	 * 
	 * @param sc - o scanner usado para a leitura
	 * @return o tamanho do vetor a ler
	 * @throws IOException 
	 * @requires sc != null
	 */
	public static int lerTamanhoVetor(Scanner sc) throws IOException  {
		if(!sc.hasNextLine()) {
			throw new IOException("Ocorreu um erro.\nO ficheiro está vazio.");
		}
		return sc.nextInt();
	}
	/**
	 * Ler um dado numero de inteiros e guardar num vetor
	 * 
	 * @param sc      - o scanner usado para a leitura
	 * @param tamanho - o numero de valores a ler
	 * @return o vetor de inteiros obtidos da leitura
	 * @requires sc != null && tamanho > 0
	 */
	public static int[] lerInteirosVetor(Scanner sc, int tamanho) throws IOException {
		sc.nextLine();
		if(!sc.hasNextLine()) {
			throw new IOException("Ocorreu um erro.\nO ficheiro nao tem mais linhas.");
		}
		int[] v = new int[tamanho];
		String[] numeros = sc.nextLine().split(" ");
		if(numeros.length != tamanho) {
			throw new InputMismatchException("Ocorreu um erro.\nTamanho diferente do vetor no ficheiro.");
		}
		for (int i = 0; i < v.length; i++) {
			v[i] = Integer.parseInt(numeros[i]);
		}
		return v; 
	}
	/**
	 * Ler um valor que representa a potencia
	 * 
	 * @param sc - o scanner usado para a leitura
	 * @return o valor obtido da leitura
	 * @requires sc != null
	 */
	public static double lerValorPotencia(Scanner sc) {
		return Double.parseDouble(sc.nextLine());
	}

	/**
	 * Determina as potencias de um vector
	 * 
	 * @param inteiros - o vetor original
	 * @param potencia - a potencia que se pretende calcular do vetor de inteiros
	 * @return o vetor com as potencias de inteiros
	 * @requires inteiros != null && potencia >= 0
	 */
	private static double[] calculaPotencias(int[] inteiros, double potencia) {
		double[] v = new double[inteiros.length];
		for(int i = 0; i < v.length; i++) {
			v[i] = Math.pow(inteiros[i], potencia);
			if(Double.isNaN(v[i])) {
				throw new ArithmeticException("Ocorreu um erro.\nUm valor do vetor calculado nao eh um numero valido.");
			}
		}
		return v;
	}

	/**
	 * Imprime os valores de um vetor de doubles
	 * 
	 * @param v - o vetor do qual se quer imprimir os valores
	 */
	private static void imprimirVetor(double[] v) {
		for (double d : v) {
			System.out.println(d);
		}
	}

}