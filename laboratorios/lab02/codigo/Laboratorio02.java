/**
 * Laboratorio 2 de Estructuras de Datos 1
 * Código sacado de: https: https://www.geeksforgeeks.org/insertion-sort/ y https://www.baeldung.com/java-merge-sort respectivamente.
 * @author Mauricio Toro, Juan Pablo Restrepo, Juan José Sánchez
 */

public class insert {// punto de insertion sort    Complejidada de O(n^2)
    public static int insertonSort(int[] array) {
        return noSe(0, 1, array);
    }
    public static int noSe(int a, int b, int[] array) {
        if (a == array.length - 1) {
            return 0;
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
