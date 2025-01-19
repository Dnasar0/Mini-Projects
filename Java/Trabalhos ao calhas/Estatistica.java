import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Estatistica{  

    public static double[] removeDuplicateElements(double arr[]){  

        return Arrays.stream(arr).distinct().toArray(); 
    }  

    public static double countOccorences(double[] v, double x) {

        double count = 0;

        for(int i = 0; i < v.length; i++) {

            if(x == v[i]) {

                count++;
            }
        }

        return count;
    }


    public static void sortArray(double[] arr) {

        double temp = 0;

        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
    
        
        return new BigDecimal(value).setScale(places, RoundingMode.HALF_UP).doubleValue();
    }
       
    public static void main (String[] args) {  
        
        double arr[] = {33, 5, 16, 17, 30, 9, 20, 16, 25, 28, 23, 20,
            27, 30, 23, 17, 28, 27, 22, 28, 45, 43, 32, 20,
            35, 37, 20, 30, 32, 18, 8, 35, 29, 19, 34, 8
            };
    

        double[] new_arr = removeDuplicateElements(arr);

        double countAverage = 0;

        double countVariance = 0;

        Arrays.sort(new_arr);
        
        System.out.println("Amostra:\n");

        for(int i = 0; i < new_arr.length; i++) {

            System.out.print(new_arr[i] + " " + countOccorences(arr, new_arr[i]) + " | "); 
        }

        System.out.println("\nTamanho da amostra: " + arr.length);

        for (int i = 0; i < arr.length; i++) {
                
            countAverage+= arr[i];
        }

        System.out.println("\nSoma total dos valores da amostra: " + round(countAverage,2));

        countAverage /= arr.length;

        System.out.println("\nMédia dos valores da amostra: " + round(countAverage,2));

        for (int i = 0; i < arr.length; i++) {
            
            countVariance += Math.pow(arr[i], 2);
        }

        System.out.println("\nSoma total do quadrado dos valores da amostra: " + round(countVariance,2));

        countVariance = (countVariance - (arr.length * Math.pow(countAverage,2))) / arr.length-1;

        System.out.println("\nVariância dos valores da amostra: " + round(countVariance,2));

        System.out.println("\nDesvio padrão dos valores da amostra: " + round(Math.sqrt(countVariance),2));

        System.out.println("\nCo-Variância dos valores da amostra: " + round(Math.sqrt(countVariance) / countAverage,2)); 
    }
}  