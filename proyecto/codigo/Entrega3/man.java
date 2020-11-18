import java.io.FileNotFoundException;
public class man
{
    public static void main(String[]args)throws FileNotFoundException {

    
    ColeccionDatos cd=new ColeccionDatos();
    cd.LecturaArchivo("5000.csv");
    //cd.calcularGiniPonderado(73,50,"MAYOR");
    //cd.calcularGiniPonderado(1);
    cd.getPos(51);
    //cd.getNombreColumn(70);









    //for(int i=1;i<=78;i++){
    //System.out.println("posicion "+i+":     "+cd.calcularGiniPonderado(i));
    }
    
}
