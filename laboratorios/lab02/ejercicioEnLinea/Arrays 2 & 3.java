//Arrays 2
public int countEvens(int[]nums){
    return countEvenss (nums,0);
}
    public int countEvenss(int[] nums,int a) {
        if(a==nums.length){
        return 0;
        }
        if(nums[a]%2==0){
        return 1+countEvenss(nums,a+1);
        }
        return countEvenss(nums,a+1);
    }



public int centeredAverage(int[] nums) {
        return noSe(0, 1, nums);
    }

    public int noSe(int a, int b, int[] array) {
        int p = 0;
        int y = 0;
        if (a == array.length - 1) {
            for (int z = 0; z <= array.length - 1; z++) {
                y = y + array[z];
            }
            y = y - array[0] - array[array.length - 1];
            p = (y) / (array.length - 2);
            return (p);
        }
        int Aux = array[a];
        if (array[b] < array[a]) {
            array[a] = array[b];
            array[b] = Aux;
            if (a - 1 < 0) {
                return noSe(a + 1, b + 1, array);
            }
            return noSe(a - 1, b - 1, array);
        }
        return noSe(a + 1, b + 1, array);
    }







// Arrays 3

public int maxSpan(int[] nums) {
    if (nums.length == 0) {
    return 0;
  } else if (nums[0] == nums[nums.length-1]) {
    return nums.length;
  } else {
    return nums.length-1;
 }
}

public int maxMirror(int[] nums) {
  int l = nums.length;
  int cont= 0;
  int max = 0;
    for (int i = 0; i < l; i++){
    cont = 0;
    for (int j = l-1; i + cont < l && j > -1; j--){
        if(nums[i+cont] == nums[j]){
        cont++;
      } else {
        if (cont > 0){
        max = Math.max(cont,max);
        cont = 0;
       }
      }
     }
    max = Math.max(cont,max);
   }
  return max;
 }
 
 public int[] seriesUp(int n) {
  int[] arr = new int[n * (n + 1) / 2];
  int i = 0;
  for (int j = 1; j <= n; ++j) {
  for (int k = 1; k <= j; ++k) {
    arr[i++] = k;
   }
  }
 return arr;
}

public int[] squareUp(int n) {
int[] arr = new int[n * n];
int step = 1;
int ind = 0;
  if(n == 0) {
  return arr;
 }
  for (int i = n-1; i < arr.length; i+=n) {
  ind = i;
  for (int j = 1; j <= step; j++) {
  if (j == 0) {
  break;
 }
  arr[ind] = j;
  ind--;
 }
  step++;
 }
  return arr;
}

public boolean canBalance(int[] nums) {
  int sum1=0;
  int sum2=0;      
  for(int j = 0;j<nums.length;j++){
  sum2+=nums[j];
 }     
  for (int i = 0; i < nums.length; i++) {
  sum1+=nums[i];
  sum2-=nums[i];
  if(sum1==sum2)return true;
 }
  return false;
}
