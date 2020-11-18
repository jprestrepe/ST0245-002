import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;


public class ColeccionDatos {
    String[] borrarLuego = new String[79];// BORRAR
    float giniPonderado;
    int contador = 0;// hará el trabajo de contar las filas que hay en el .txt
    int columnas = 0;// contará cuantos datos hay por estudiante
    ArrayList<String[]> arreglo;
    String[] tmpColumn;
    String[] contenedorDDatos;// sirve para contener los datos de la columna deseada y calcular el gini
                              // ponderado
    public ArrayList<String[]> estudiantes;

    /**
     * constructor, crea un arraylist de la clase estudiantes
     * 
     */
    public ColeccionDatos() {
        estudiantes = new ArrayList<>();
    }

    /**
     * LecturaArchivo lee un archivo .txt o .csv, tambien se definirá el tamaño de
     * la matriz y tembien, se le dará el valor a cada espacio de la matriz
     * 
     * @param Archivo nombre del archivo que se desea leer, hay que escribir el
     *                nombre +.csv o .txt
     * @throws FileNotFoundException si no encuntra el archivo, el programa lo dirá
     */
    protected ArrayList<String[]> LecturaArchivo(String Archivo) throws FileNotFoundException {
        Scanner Dato0 = new Scanner(new File(Archivo));
        String aux;
        String aux2;
        while (Dato0.hasNextLine()) {
            String line = Dato0.nextLine();
            line = line.replace(" ", "");
            line = line.replace(";;", ";vacio;");
            line = line.replace(";;", ";vacio;");
            line = line.replace(";", " ");
            Scanner lineScan = new Scanner(line);
            if (contador == 0) {

                do {
                    columnas++;
                    aux = lineScan.next();
                    borrarLuego[columnas] = aux;// BORRAR
                } while (lineScan.hasNext());
            }
            tmpColumn = new String[columnas];
            int i = 0;
            if (contador > 0) {
                do {
                    aux2 = lineScan.next();
                    tmpColumn[i] = aux2;
                    i++;
                } while (lineScan.hasNext());
                Estudiante cd = new Estudiante(tmpColumn);
                estudiantes.add(tmpColumn);
            }
            contador++;
            lineScan.close();
        }
        
        arreglo = new ArrayList<>();// contador][columnas];
        for (int i = 0; i < contador - 1; i++) {// asignar cada estudiante al arreglo
            arreglo.add(estudiantes.get(i)) ;
        }
        contador = contador - 1;
        System.out.println("Fueron encontrados: " + contador + " estudiantes de manera correcta, y cada uno tiene: "
                + columnas + " datos");
        Dato0.close();
        return arreglo;
    }

    /**
     * calcularGiniPonderado calcula el giniPonderado de una posicion en especifica
     * ,solo recibe y funciona con respuestas de Si o No
     * 
     * @param posCol posicion de la columna que se desea encontrar el giniPonderado
     *               (empieza a contar desde 1)
     * @return el valor del giniPonderado
     */
    public double calcularGiniPonderado(int posCol) {
        giniPonderado = 0;
        posCol = posCol - 1;// para cuando el usuario busque no le toque empezar desde 0
        float p0 = 0;
        float p1 = 0;

        int a = 0;
        int b = 0;
        String pivote;
        contenedorDDatos = new String[contador];
        for (int j = 0; j < contador; j++) {
            contenedorDDatos[j] = Arrays.toString(arreglo.get(j));
        }
        pivote = contenedorDDatos[0];
        int borrar = 0;
        while (pivote.equals("vacio")) {
            borrar++;
            pivote = contenedorDDatos[borrar];
        }
        for (int j = 0; j < contenedorDDatos.length; j++) {
            if (contenedorDDatos[j].equals("vacio")) {
                borrar++;
            } else if (contenedorDDatos[j].equals(pivote)) {
                a++;
            } else
                b++;
        }
        p0 = (float) a / (a + b);
        p1 = (float) b / (a + b);
        giniPonderado = 0;
        giniPonderado = (float) (1 - ((Math.pow(p0, 2) + Math.pow(p1, 2))));
        System.out.println("el gini ponderado en " + getNombreColumn(posCol + 1) + " es de: " + giniPonderado);
        return giniPonderado;
    }

    /**
     * calcularPonderada calcula el gini ponderado entre 4 nodos, primero se usa el
     * metodo calcularImpureza para sacar el gini de 2 nodos en 2
     * 
     * @param nd1 nodo derecho de respuesta 1
     * @param nd0 nodo derecho de respuesta 0
     * @param ni1 nodo izquierdo de repuesta 1
     * @param ni0 nodo izquierdo de respuesta 0
     * @return el gini entre el gini de los nodo de la izquierda y derecha
     */
    public double calcularPonderada(float nd1, float nd0, float ni1, float ni0) {
        if ((nd1 + nd0) == 0 || (ni1 + ni0) == 0)
            return 0.5;
        double total = ((ni0 + ni1) * calcularImpureza(ni0, ni1) + (nd0 + nd1) * calcularImpureza(nd0, nd1))
                / (ni1 + nd0 + nd1 + ni0);
        return total;

    }

    /**
     * metodo privado, usado por calcularPonderada para sacar el gini entre 2 nodos
     * dados
     * 
     * @param n0 primer nodo dado
     * @param n1 segundo nodo dado
     * @return el gini entre los dos nodos dados
     */
    private double calcularImpureza(float n0, float n1) {
        double p0 = n0 / (n1 + n0);
        double p1 = n1 / (n1 + n0);
        double total = 1.0 - (p0 * p0 + p1 * p1);
        return total;

    }

    /**
     * este metodo lee datos numericos de una columna en especifico, encuentra el
     * giniponderado a traves de preguntar si es mayor o menor.
     * 
     * @param posCol datos de una columna en especifico (empieza a contar desde 1)
     * @param pivote tipo double, este es el valor "pivote", este valor sirve para
     *               comparar los datos que entraran
     * @param MoM    tipo String,aca es se define si mayor o menor. ej: "MAYOR" ó
     *               "MENOR"
     * @return el resultado del giniPonderado
     */
    public double calcularGiniPonderado(int posCol, double pivote, String MoM) {
        int mayor = 0;
        int noMayor = 0;
        int vacio = 0;
        float p1, p0;
        double resultTemp = 0;
        posCol = posCol - 1;
        contenedorDDatos = new String[contador];
        for (int i = 0; i < contador; i++) {
            contenedorDDatos[i] = Arrays.toString(arreglo.get(i));
        }
        for (int i = 0; i < contenedorDDatos.length; i++) {
            if (contenedorDDatos[i].equals("vacio")) {
                vacio++;
            } else if (MoM.equals("MAYOR")) {
                resultTemp = Double.parseDouble(contenedorDDatos[i]);
                if (resultTemp >= pivote) {
                    mayor++;
                } else if (resultTemp < pivote) {
                    noMayor++;
                }
            } else if (MoM.equals("MENOR")) {
                resultTemp = Double.parseDouble(contenedorDDatos[i]);
                if (resultTemp <= pivote) {
                    mayor++;
                } else if (resultTemp > pivote) {
                    noMayor++;
                }

            }
        }
        p0 = (float) mayor / (mayor + noMayor);
        p1 = (float) noMayor / (mayor + noMayor);
        giniPonderado = 0;
        giniPonderado = (float) (1 - ((Math.pow(p0, 2) + Math.pow(p1, 2))));
        System.out.println("el gini ponderado en " + getNombreColumn(posCol + 1) + " es de: " + giniPonderado);
        return giniPonderado;
    }

    /**
     * este metodo imprime cada dato de una posicion en especifico
     * 
     * @param s posicion de la columna que se desea leer
     */
    public void getPos(int s) {
        System.out.println(arreglo.size());
        s = s - 1;
        int vacios = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(arreglo.get(i)));
            if (Arrays.toString(arreglo.get(i)).equals("vacio")) {
                vacios++;
            }
        }
        System.out.println("hay " + vacios + " de vacio");
    }

    /**
     * metodo para devolver el nombre de una columna en una poscion en especifica
     * 
     * @param a posicion de la columna que se desea (empieza a contar desede 1)
     * @return la string con el nombre de la columna
     */
    public String getNombreColumn(int a) {
        return "[" + borrarLuego[a] + "]";
    }
}