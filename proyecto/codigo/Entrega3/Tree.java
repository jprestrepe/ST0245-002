import java.util.ArrayList;
import java.util.LinkedList;

public class Tree{
	/**arbo, usando el metodo comparar() compara los y saca las mejores preguntas
     * 
     * @param arreglo	arraylist, el cual va a contener mejor pregunta
     * @param inicio	se usa en el ciclo para iniciar el programa
     * @param fin		se usa para terminar el arbol
     * @param visitados	hace referencia a un arreglo que almacena las preguntas ya evaluadas
     * @return	el arregl
     */
	public static double[] Arbol(ArrayList<String[]> arreglo,int inicio, int fin,LinkedList<Integer[]> visitados) {
		double[] mejor= {0,0,100};
		for(int i= inicio;i<fin;i++) {
		double[] temp=sacarMejorPregunta( arreglo, i, 0, 100);
			if(mejor[2]>temp[1] && comparar(i,temp[0],visitados)) {
				mejor[0]=i;
				mejor[1]=temp[0];
				mejor[2]=temp[1];
			}
		}
		Integer[] s={(int) mejor[0],(int) mejor[1]};
		visitados.add(s);
		return mejor;
    }
    

	/**
     * 
     * @param a
     * @param temp
     * @param visitados	hace referencia a un arreglo que almacena las preguntas ya evaluadas
     * @return
     */
	private static boolean comparar(int a,double temp, LinkedList<Integer[]> visitados) {
		for(Integer[] n:visitados) {
			if(n[0]==a && n[1]==temp)return false;
		}
		return true;
    }
    

    /**crea un arbol nuevo
     * 
     * @param array	guardar el arbol nuevo
     * @param pp	
     * @param ini
     * @param fin
     * @return
     */
	public static double[] sacarMejorPregunta(ArrayList<String[]> array, int pp, int ini, int fin) {
		int mejor = ini;
		for (int i = 1; i < fin - ini; i++) {
			double d1 = sacarGuini(array, pp, ini+i);
			double d2 = sacarGuini(array, pp, mejor);
			mejor = d1 < d2 ? ini + i : mejor;
		}
		double[] arbolNuevo = {mejor, sacarGuini(array, pp, mejor)};
		return arbolNuevo;
	}

    /**saca el gini de los nodos
     * 
     * @param array arraylist para guardar el resultado del gini
     * @param pp
     * @param np
     * @return
     */
	public static double sacarGuini(ArrayList<String[]> array, int pp, int np) {
		float nd1 = 0, nd0 = 0, ni1 = 0, ni0 = 0;
		for (int i = 1; i < array.size(); i++) {
			String s1 = array.get(i)[pp-1];
			String temp = Float.parseFloat(s1) >= np ? "1" : "0";
			String temp2 = array.get(i)[array.get(i).length - 1];
			if (temp.equals("1")) {
				if (temp.equals(temp2))
					nd1++;
				else
					nd0++;
			} else {
				if (temp.equals(temp2))
					ni1++;
				else
					ni0++;
			}
		}
		ColeccionDatos g = new ColeccionDatos();
		return g.calcularPonderada(nd1, nd0, ni1, ni0);
	}
}