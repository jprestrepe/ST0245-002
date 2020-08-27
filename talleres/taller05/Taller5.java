package proyecto;

/**
 *
 * @author Juan Pablo Restrepo, Juan José Sanchez, Mauricio Toro, Andres Paez
 */
 
 public class Taller5{
     public static int suma (int[]array){ //O(n)
     int resultado = 0; 
        
     for (int i = 0; i < array.length ; i++) {
     resultado += array[i]; 
    }
     return resultado; 
    }
    
    public static void mul (int num){ //O(n)
    for (int i = 0; i <= 10; i++) {
    System.out.println(num + " x " + i + " = " + (num * i)); 
        }
    }
    
     public static int[] insertionSort (int[] array){
      
    }       
 }
