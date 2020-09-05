/**
 * Laboratorio 2 de Estructuras de Datos 1
 * Código sacado de: https: https://www.geeksforgeeks.org/insertion-sort/ y https://www.baeldung.com/java-merge-sort respectivamente.
 * @author Mauricio Toro, Juan Pablo Restrepo, Juan José Sánchez
 */

public class Laboratorio02{   
  public static void insertionSort(int[] A){ //T(n) = O(n^2)
  for (int i = 1; i < A.length; i++) {  
  int key = A[i];     
  int j = i-1;    
  while(j >= 0 && A[j] > key){ 
  A[j+1] = A[j];  
  j--;    //n^2
 }
  A[j+1] = key; 
 }
}

   public static void mergeSort(int[] a, int n){ // O(n)
   if (n < 2) {
   return;
  }
   int mid = n / 2;
   int[] l = new int[mid];
   int[] r = new int[n - mid];
   for (int i = 0; i < mid; i++) {
   l[i] = a[i];
  }
   for (int i = mid; i < n; i++) {
   r[i - mid] = a[i];
  }
   mergeSort(l, mid);
   mergeSort(r, n - mid);
   merge(a, l, r, mid, n - mid);
  }


   public static void merge(
   int[] a, int[] l, int[] r, int left, int right){
   int i = 0, j = 0, k = 0;
   while (i < left && j < right) {
   if (l[i] <= r[j]) {
   a[k++] = l[i++];
  }
   else {
   a[k++] = r[j++];
  }
  }
   while (i < left) {
   a[k++] = l[i++];
  }
   while (j < right) {
   a[k++] = r[j++];
  }
 }
}
