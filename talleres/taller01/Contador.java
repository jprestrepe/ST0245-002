import java.util.Scanner;
/**
 *
 * @author Juan Pablo Restrepo, Juan José Sanchez
 */
public class Contador {
    private int cantidad;
    private int cuenta;
    private final String id;

    public Contador(String id) {
        this.id = id;
        cuenta=0;
        cantidad = 0;
    }

    public void incrementar() {
        cuenta +=1;
    }
    
    public void decrementar() {
        cuenta-=1;
    }

    public int leerValorIcremento() {
        Scanner valor = new Scanner(System.in);
        System.out.println("Valor a incrementar: ");
        cantidad = valor.nextInt();
        return cantidad;
    }
    public int leerValorDecremento() {
        Scanner valor = new Scanner(System.in);
        System.out.println("Valor a reducir: ");
        cantidad = valor.nextInt();
        return cantidad;
    }

    public String toString() {
        return "El valor de su cuenta es: "+cuenta;
    }
}
