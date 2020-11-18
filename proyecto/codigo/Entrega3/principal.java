
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;

class principal {
	public static void main(String[] args) throws FileNotFoundException {
		ColeccionDatos cd = new ColeccionDatos();
		LinkedList<Integer[]> visitados = new LinkedList<>();
		//ArrayList<String[]> arreglo = cd.LecturaArchivo("C:\\Users\\57322\\Downloads\\valores.csv");
		ArrayList<String[]> arreglo = cd.LecturaArchivo("5000.csv");
		double[] temp = Tree.Arbol(arreglo, 66, 73, visitados);
		Node raiz = new Node(arreglo, temp);

		dividirArbol(raiz, visitados);

		int i = 0;
	}

	public static void dividirArbol(Node nodo, LinkedList<Integer[]> visitados) {
		if (nodo.pregunta[2] == 0 || nodo.pregunta[2] == 100)
			return;
		ArrayList<String[]> datosDerecha = new ArrayList<>();
		ArrayList<String[]> datosIzquierda = new ArrayList<>();
		for (int i = 1; i < nodo.datos.size(); i++) {
			String[] estudiante = nodo.datos.get(i);
			if (Float.parseFloat(estudiante[(int) nodo.pregunta[0]]) >= nodo.pregunta[1])
				datosDerecha.add(estudiante);
			else
				datosIzquierda.add(estudiante);
		}
		nodo.derecha = new Node(datosDerecha, Tree.Arbol(datosDerecha, 67, 71, visitados));
		nodo.izquierda = new Node(datosIzquierda, Tree.Arbol(datosIzquierda,67, 68, visitados));
		dividirArbol(nodo.derecha, visitados);
		dividirArbol(nodo.izquierda, visitados);
	}

}
