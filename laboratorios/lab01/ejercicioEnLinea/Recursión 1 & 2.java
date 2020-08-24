
//Recursión 1

public class Recursion1 {
    public int factorial(int n) {
    if (n == 1){
    return 1;
   }
    return n * factorial(n - 1);
   }

    public int bunnyEars(int bunnies) {
    return bunnies * 2;
    }

    public int fibonacci(int n) {
    if ((n == 0) || (n == 1)){
    return n;
   }else{
    return fibonacci(n - 1) + fibonacci(n - 2);
   }
    
    public int bunnyEars2(int bunnies) {
     if (bunnies == 0) {
     return 0;
    }
     if (bunnies % 2 == 0) {
     return bunnyEars2(bunnies - 1) + 3;
    }
     if (bunnies % 2 != 0){
     return bunnyEars2(bunnies - 1) + 2;
    }
     return bunnyEars2(bunnies - 1);
    }

    public int triangle(int rows) {
    if (rows == 0){
    return 0;
   }
    return triangle(rows - 1) + rows;
   }
  }

//Recursión 2

public class Recursion2 {
  public boolean groupSum5(int start, int[] nums, int target) {
  if (start >= nums.length) {
    if (target == 0) {
      return true;
    }
    return false;
  }
  if (nums[start] % 5 == 0) {
    if(start < nums.length - 1 && nums[start+1] == 1){
      return groupSum5(start + 2, nums, target - nums[start]);
    }
    return groupSum5(start + 1, nums, target - nums[start]);
  }
  if (groupSum5(start + 1, nums, target - nums[start])){
    return true;
  }
  return groupSum5(start + 1, nums, target);
}

  public boolean groupSum6(int start, int[] nums, int target) {
  if (start == nums.length) {
  return target == 0;
 }
  if (nums[start] == 6) {   
  return groupSum6(start + 1, nums, target - nums[start]);
 }
  if (groupSum6(start + 1, nums, target - nums[start])) {
  return true;
 }
  return groupSum6(start + 1, nums, target);
}

  public boolean groupNoAdj(int start, int[] nums, int target) {
  if (start >= nums.length) {
  return (target == 0);
 }
  if (groupNoAdj(start+1, nums, target)) {
  return true;
 }
  if (groupNoAdj(start+2, nums, target-nums[start])) {
  return true;
 }
  return false;
}

  public boolean groupSumClump(int start, int[] nums, int target) {
  int i = start;
  int sum = 0;
  
  if (start >= nums.length) {
  return target == 0;
 }
  while (i < nums.length && nums[start] == nums[i]) {
    sum += nums[i];
    i++; 
 }
  if (groupSumClump(i, nums, target - sum)) {
  return true;
 }
  if (groupSumClump(i, nums, target)) {
  return true;
 }
  return false;
}

  public boolean recursiveHelper(int start, int[] nums, int g1, int g2) {
  if (start >= nums.length) {
  return g1 == g2;
 }
  if (recursiveHelper(start+1, nums, g1 + nums[start], g2)) {
  return true;
 }
  if (recursiveHelper(start+1, nums, g1, g2 + nums[start])) {
  return true;
 }
  return false;
}

public boolean splitArray(int[] nums) {
  return recursiveHelper(0, nums, 0, 0);
 }
