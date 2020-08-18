package proyecto;


import proyecto.AdvancedEncryptionStandard;

/**
 *
 * @author Juan Pablo Restrepo, Juan José Sanchez
 */
public class Taller03 {

    private static void torresDeHannoiAux(int n, int torre1, int torre2, int torre3){
        if(n == 0){
            return;
        }else{
            torresDeHannoiAux(n-1, torre1, torre3, torre2);
            System.out.println("Mover disco de la torre "+torre1+" a la torre "+torre3+".");
            torresDeHannoiAux(n-1, torre2, torre1, torre3);
        }
    }

    public static void torresDeHannoi(int n) {
        torresDeHannoiAux(n, 1, 2, 3);
    }
    
    private static void permutationsAux(String base, String s){
        if(s.length() == 0){
            System.out.println(base);
            System.out.println(AdvancedEncryptionStandard.desencriptarArchivo(base));
        }else{
            for(int i = 0; i<s.length(); i++){
                permutationsAux(base + s.charAt(i), s.substring(0, i)+s.substring(i+1, s.length()));
            }
        }
    }

    public static void permutations(String s){
        permutationsAux("", s);
    }
}

