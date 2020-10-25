import java.util.ArrayList;

/**
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html"> Abstract </a>
 * @author Juan Pablo Restrepo, Juan José Sánchez
 */
 
public abstract class Digraph {
	protected int size;

	public Digraph(int vertices) {
		size = vertices;
	}

	public abstract void addArc(int source, int destination, int weight);

	/**
 	* @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html"> Ver documentacion ArrayList </a>
	*/
	public abstract ArrayList<Integer> getSuccessors(int vertex);

	public abstract int getWeight(int source, int destination);

	public int size() {
		return size;
	}
}
