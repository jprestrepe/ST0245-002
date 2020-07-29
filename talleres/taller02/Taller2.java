/**
*@autor Juan Pablo Restrepo, Juan José Sanchez, Mauricio Toro, Camilo Paez
*@version 1
*/

public class Taller2 {

    public static int gcd(int p, int q){
	if (q==0){
  	return p;
    }else{
    return gcd(q, p % q);
    }
}

 public static boolean SumaGrupo(int[] nums, int target) {
        return SumaGrupo(0, nums, target);
}

private static boolean SumaGrupo(int start, int[] nums, int target) {
	if (start == nums.length){
  	return target == 0;
  } else{
   return SumaGrupo(start + 1, nums, target -= nums[start]) || SumaGrupo(start + 1, nums, target += nums[start]);
 }
}
 
      public static void combinations(String s) { 
	combinationsAux("", s); 
}
        
    private static void combinationsAux(String prefix, String s) {
        if(s.length()== 0) {
            System.out.println( prefix );
        }else{
            combinationsAux( prefix + s.charAt(0), s.substring(1));
            combinationsAux( prefix, s.substring(1));
           }
        }   
}