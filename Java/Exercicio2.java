public class Exercicio2 {
  public static int logInteiro(int exp, int base){
    int log = 0;
    while(exp >= base){
      exp /= base;
      log ++;
    }
    return(log);
  }
  public static int minFatorial(int ex){
    int min = 1;
    int fact = 1;
    while(fact < ex){
      min ++;
      fact *= min;
    } 
    return(min);
  }

  public static int quotient(int dividend, int divider){
    int quotient = dividend / divider;
    return(quotient);
  }

  public static int squareRoot(int num){
    int squareRoot = 1;
    while(squareRoot*squareRoot < num){
      squareRoot++;
    }
    return(squareRoot);
  }
  public static void main(String[] args) {
    int k = 200;
    int n = 100;
    int m = 5;
    System.out.println("maior numero natural que pode ser usado como expoente numa potencia de 2 sem exceder " + n + ": " + logInteiro(n,2));
    System.out.println("menor numero natural cujo fatorial e maior que " + k + ": " + minFatorial(k));
    System.out.println("o quociente da divisao inteira de " + n + " por " + m + ": " + quotient(n,m));
    System.out.println("a raiz quadrada de " + n + ": " + squareRoot(n));
  }
}