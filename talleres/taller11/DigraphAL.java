import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Mauricio Toro, Juan Pablo Restrepo, Juan José Sánchez
*/

public class DigraphAL extends Digraph {
	LinkedList< Pair<Integer, Integer>>[] arregloDeListas;

	public DigraphAL(int size) {
		super(size);
    arregloDeListas = new LinkedList[size];
		
	}

	public void addArc(int source, int destination, int weight) {
		 if(arregloDeListas[source] == null){
                     arregloDeListas[source] = new LinkedList<Pair<Integer, Integer>>();            
                 }
                  arregloDeListas[source].add(new Pair(destination, weight));
	}

	/**
 	* @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html"> Ver documentacion ArrayList </a>
	*/
	public ArrayList<Integer> getSuccessors(int vertex) {
		LinkedList< Pair<Integer, Integer> > destinos = arregloDeListas[vertex];
                ArrayList<Integer> sucesores = new ArrayList<>();
                if(destinos.isEmpty())return sucesores; 
                for(int i = 0; i < destinos.size(); i++){
                   sucesores.add(destinos.get(i).first);
                }
                return sucesores;
	}

	public int getWeight(int source, int destination) {
		LinkedList< Pair<Integer, Integer> > destinos = arregloDeListas[source];
                 for (int i = 0; i < destinos.size(); i++)
                     if (destinos.get(i).first == destination)
                        return destinos.get(i).second;
                  return 0;
	}
}
