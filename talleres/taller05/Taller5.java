package proyecto;

/**
 *
 * @author Juan Pablo Restrepo, Juan José Sanchez, Mauricio Toro, Andres Paez
 */
 
public class Taller5 {
    public static int suma(int[] array) { // O(n)
        int resultado = 0;

        for (int i = 0; i < array.length; i++) {
            resultado += array[i];
        }
        return resultado;
    }

    public static void mul(int num) { // O(n)
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

 
 
    // punto de insertion sort
    public static int insertinSort(int[] array) {
        return noSe(0, 1, array);
    }

    public static int noSe(int a, int b, int[] array) {

        if (a == array.length - 1) {
            // el siguiente ciclo imprime el arreglo ya organizado
            int i = 0;
            while (i < array.length) {
                System.out.println("" + array[i]);
                i++;
            }
            return 0;
        }

        int Aux = array[a];
        if (array[b] < array[a]) {
            array[a] = array[b];
            array[b] = Aux;
            if (a - 1 < 0) {
                return noSe(a + 1, b + 1, array);
            }
            return noSe(a - 1, b - 1, array);
        }
        return noSe(a + 1, b + 1, array);
    }

}
