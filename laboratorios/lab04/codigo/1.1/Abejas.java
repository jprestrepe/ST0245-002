public class Abejas{
   private double latitud;
   private double altura;
   private double longitud;
   public Abejas(double latitud, double longitud,double altura){
      this.latitud=latitud;
      this.longitud=longitud;
      this.altura=altura;
   }
   
   public double getLatitud(){
      return latitud;
   }
   public double getAltura(){
      return altura;
   }
   public double getLongitud(){
      return longitud;
   }
}