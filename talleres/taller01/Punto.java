/**
 *
* @author Juan Pablo Restrepo, Juan José Sanchez
 */
public class Punto {
    private double x, y;
    
    
    public Punto(double x, double y){
        this.x=x;
        this.y=y;
    }
    public Punto(){
        this(0,0);
    }
    
    public double x(){
        return this.x;
    }
    
    public double y(){
        return this.y;
    }
    
    public double radioPolar(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    
    public double anguloPolar(){
        return Math.atan2(y,x);
    }
    
    public double distanciaEuclidiana(Punto otro){
        double diferenciaX = this.x - otro.x();
        double diferenciaY = this.y - otro.y();

        return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
    }
}

