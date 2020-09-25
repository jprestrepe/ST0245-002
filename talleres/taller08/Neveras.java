public class Nevera
{
    protected String marca;
    protected int codigo;
    
    public Nevera(string marca, String codigo){
        this.marca = marca;
        this.codigo = codigo;
   }
    public int getCodigo(){
		return this.codigo;
	}
	public String getMarca(){
		return this.marca;
	}
	
	public String toString(){
		return ("+this.codigo+", "+this.marca+");
	}
}
