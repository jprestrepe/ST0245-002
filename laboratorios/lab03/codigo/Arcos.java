
public class Arcos{
   
    private long id;
    private long id2;
    private double distancia;
    private String nombre;
    
    public Arcos(long id, long id2, double distancia, String nombre) {
        this.id = id;
        this.id2 = id2;
        this.distancia = distancia;
        this.nombre = nombre;
    }
    
    public Arcos(long id, long id2, double distancia) {
        this(id, id2, distancia, "desconocido");
    }
    
    public long getId() {
        return this.id;
    }
    
    public long getId2() {
        return this.id2;
    }
    
    public double getDistancia() {
        return this.distancia;
    }
    
    public String getName() {
        return this.nombre;
    }
}