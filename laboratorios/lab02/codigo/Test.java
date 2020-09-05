public class Test{
 public static void insertionTest(){
 int[] A = {6, 2, 3, 4, 5, 1, 7, 8};
 Laboratorio02.insertionSort(A);
  for(int a : A){
     System.out.println(a);
 }
}
    
 public static void mergeTest(){
 int[] A = {5, 1, 6, 2, 3, 4};
 Laboratorio02.mergeSort(A, A.length);
 for(int a : A){
     System.out.println(a);
 }
}

 public static void main(String[] args) {
 System.out.println("Insertion Sort");
 insertionTest();
 System.out.println("Merge Sort");
 mergeTest();
}
}
