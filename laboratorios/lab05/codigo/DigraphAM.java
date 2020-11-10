
import java.util.ArrayList;

public class DigraphAM extends Graph{
    private int [][] grafoAM;

    public DigraphAM(int vertices) {
        super(vertices);
        grafoAM = new int[size][size];
    }

    public void addArc(int source, int destination, int weight){
        grafoAM[source][destination] = weight;
    }

    public ArrayList<Integer> getSuccessors(int vertice){
        ArrayList<Integer> sucesores = new ArrayList<>();
        for (int i = 1; i < size(); i++) {
            if(grafoAM[vertice][i] == 0){
                continue;
            }else{
                sucesores.add(grafoAM[0][i]);
            }
        }
        return sucesores;
    }

    public int getWeight(int source, int destination){
        int weight = grafoAM[source][destination];
        return weight;
    }
}
