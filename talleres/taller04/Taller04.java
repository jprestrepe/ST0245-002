package proyecto;

/**
 *
 * @author Juan Pablo Restrepo, Juan José Sanchez
 */
public class Taller04 {
       
    public static int arrayMax(int[] array, int n) {
        int max, temp;
        max = array[n];
        if(n != 0) {
            temp = arrayMax(array, n-1); 
            //T(n) = T(n-1) + c2
            if(temp >= max)
            max = temp;
        }
        return max;
    }

    
    public static boolean groupSum(int start, int[] nums, int target) {
      if (start == nums.length) 
      // c1
       return target == 0;     
      // T(n) = c1 + c2
      else
       return groupSum(start+1, nums, target)
              // T(n) = c3 + 2*T(n-1)
          ||  groupSum(start+1,nums,target-nums[start]);
              // T(n) = c1*2^(n-1) + c3*(2^n - 1)
 }
    
    public static long fibonacci(int n) {
        if (n <= 1) {
          return n;
        } else {
          return fibonacci(n - 1) + fibonacci(n - 2);
          //T(n) = T(n-1) + T(n-2) + c_2
        }
    }
}