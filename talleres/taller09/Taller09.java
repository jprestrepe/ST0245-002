/**
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html">HashMap API</a>
 * @version 1
 * @author Juan Pablo Restrepo, Juan José Sánchez, Mauricio Toro.
 */

import java.util.HashMap;

public class Taller9{
    
    public static void agregar(HashMap empresas,String key, String value){
      	empresas.put(key, value);
    }
    

    public static boolean buscar(HashMap empresas,String key){
        return empresas.containsKey(key);
    }
		
    public static boolean contieneValue(HashMap empresas,String value){
      	return empresas.containsValue(value);
    } 
}
