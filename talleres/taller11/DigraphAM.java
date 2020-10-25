import java.util.ArrayList;

/**
 * @author Mauricio Toro, Juan Pablo Restrepo, Juan José Sánchez
 */
public class DigraphAM extends Digraph {
	
        int[][] matriz;  
      
	public DigraphAM(int size) {
		super(size);
    matriz = new int[size][size];
	
	}

	public void addArc(int source, int destination, int weight) {
		matriz[source][destination] = weight;
	}

	/**
 	* @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html"> Ver documentacion ArrayList </a>
	*/
	public ArrayList<Integer> getSuccessors(int vertex) {
		ArrayList<Integer> successor = new ArrayList();
        for (int i = 0; i < size; i++)
            if (matriz[vertex][i] != 0)
                successor.add(i);
        return successor;
	}

	public int getWeight(int source, int destination) {
		return matriz[source][destination];
	}
}
