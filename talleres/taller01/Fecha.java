/**
 *
* @author Juan Pablo Restrepo, Juan José Sanchez
 */
public class Fecha {
    
    private final int dia;
    private final int mes;
    private final int anyo;
    
    public Fecha(int dia, int mes, int anyo){
        this.dia=dia;
        this.mes=mes;
        this.anyo=anyo;
    }
    
    public int dia(){
        return this.dia;
    }
    
    public int mes(){
        return this.mes;
    }

    public int anyo(){
        return this.anyo;
    }
    
    public int comparar(Fecha otra){
        if (this.anyo < otra.anyo) 
            return -1;      
        if (this.anyo > otra.anyo) 
            return 1; 
        if (this.anyo == otra.anyo) 
            return 0;  
          
        if (this.mes < otra.mes) 
            return -1;         
        if (this.mes > otra.mes) 
            return 1;  
        if (this.mes == otra.mes) 
            return 0;
        
        if (this.dia < otra.dia) 
            return -1;         
        if (this.dia > otra.dia) 
            return 1;
        if (this.dia == otra.dia) 
            return 0;
           
        return 0;
    }
    
    @Override
    public String toString(){
        return "La fecha es: " + dia + "/" + mes + "/" + anyo;
    }
}
