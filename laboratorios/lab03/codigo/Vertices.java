
public class Vertices{
    
    private long id;
    private double y;
    private double x;
    private String nombre;
    
    public Vertices(long id, double y, double x, String nombre) {
        this.id = id;
        this.y = y;
        this.x = x;
        this.nombre = nombre;
    }
    
    public Vertices(long id, double y, double x) {
        this(id, y, x, "");
    }
    
    public long getId() {
        return this.id;
    }
    
    public double getY() {
        return this.y;
    }
    
    public double getX() {
        return this.x;
    }
    
    public String getName() {
        return this.nombre;
    }
}