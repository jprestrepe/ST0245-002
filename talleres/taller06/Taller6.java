
/**
 * Para más información de la clase ArrayList:
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html"> Ver documentacion ArrayList </a>
 * @author Mauricio Toro, Andres Paez, Juan Pablo Restrepo, Juan José Sánchez 
 */

public class MiArrayList {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private int elements[];

    public MiArrayList() {
        size = 0;
        elements = new int[DEFAULT_CAPACITY];
    }

    public int size() {
        return this.size;
    }

    public void add1(int e){ // O(n)
     if (size == elements.length) {
     int[] nArr = new int[elements.length*2]; 
     for (int i = 0; i < elements.length; i++) 
     nArr[i] = elements[i];  
     elements = nArr;
    }
     elements[size] = e;
     size++;
    }

    public int get(int i){
    if(i < size && i >= 0){  
    return elements[i];  
   }else{
    throw new ArrayIndexOutOfBoundsException(); 
    }

    public void add(int index, int e) {
     if (size == elements.length) {
     int [] nArr = new int [elements.length*2];
     for (int i = 0; i < elements.length; i++) {
     nArr[i] = elements[i];
    }
     elements = nArr;
    }
     int [] nArr1;
     nArr1 = elements;
     for (int i = index+1; i < elements.length; i++) {
     nArr1[i] = elements[i-1];
    }
     elements = nArr1;
     elements[size] = e;
     size++;
    }
    
    public void del(int index){
        int [] nArr1;
        nArr1=elements;
        for (int i = index; i < elements.length-1; i++) {
            nArr1[i] = elements[i+1];
        }
        elements = nArr1;
        size--;
    }
