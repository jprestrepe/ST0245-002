/**
* @author Juan Pablo Restrepo, Juan José Sánchez, Mauricio Toro.
* @version 1
*/
public class UnaTablaDeHash{

   private int[] tabla;

   public UnaTablaDeHash(){
      tabla = new int[10];
   }

   private int funcionHash(String k){
       return ((int) k.charAt(0)) % 10;
   }

   public int get(String k){
       int pos = funcionHash(k);
       return tabla[posicion];
   }

   public void put(String k, int v){
       int pos = funcionHash(k);
       tabla[pos] = v;
   }
}
