import java.util.ArrayList;

public class Node {

	double[] pregunta;
	Node derecha;
	Node izquierda;
	ArrayList<String[]> datos;
	
	public Node(ArrayList<String[]> datos,double[] pregunta) {
		this.datos=datos;
		this.pregunta=pregunta;
	}

}

