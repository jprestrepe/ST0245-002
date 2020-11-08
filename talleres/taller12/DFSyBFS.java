import java.util.LinkedList;

/**
 * @author Juan Pablo Restrepo, Juan José Sánchez
 */
    
 public class DFS{
    public boolean isThereARoadDFS(Graph g, int origin, int destination){
        boolean[] visitados = new boolean[g.size()];
        return isThereARoadDFS(origin, destination, visitados);
    }
    
    public boolean isThereARoadDFS(int origin, int destination, boolean[] visitados){
        visitados[origin] = true;
        if(origin == destination){
            return true;
        }
            for(Integer s : getSuccessors(origin)){
            if(!visitados[s]){
            if(isThereARoadDFS(s,destination,visitados)){
            return true;
           }
          }
         }
            return false;
    }
   }
    
public class BFS{
   public boolean isThereARoadBFS(Graph g, int origin, int destination){
        LinkedList<Integer> objetivo = new LinkedList<>();
        for(Integer s: g.getSuccessors(origin)){
            objetivo.add(s);
        }
        boolean visitados[] = new boolean[g.size()];
        visitados[origin] = true;
        objetivo.add(origin);
        if(origin == destination){
        return true;
       }
        while(!objetivo.isEmpty()){
        int temp = objetivo.pop();
        if(temp == destination){
        return true;
       }
        visitados[temp] = true;
        for(Integer sigueinte: g.getSuccessors(temp)){
        if(!visitados[sigueinte]){
        objetivo.add(sigueinte);
       }
      }
     }
       return false;
    }
}
}
