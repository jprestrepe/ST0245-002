public class miLinkedList {
    Node head;

    public void leerArchivoTXT(String nombre_del_fichero) throws FileNotFoundException {// busca un fichero con
        int i = 0;

        nombre_del_fichero = (nombre_del_fichero.endsWith(".txt") ? nombre_del_fichero : nombre_del_fichero + ".txt");
        Scanner sc = new Scanner(new File(nombre_del_fichero));

        while (sc.hasNextLine()) { // O(n)
            String linea = sc.nextLine();
            Scanner val = new Scanner(linea);
            String coordenadas = val.next();
            addAbejas(coordenadas, i); // O(n)
            i++;
            val.close();
        }
        borrarAbejas(0);
        sc.close();
    }

    public void append(String data) {// agrega un nodo al final de la lista
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node head = this;
        while (head.next != null) {
            head = head.next;
        }
        head.next = new Node(data);
    }

    public void crearHead(String data) {// crear una head
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void add(String data, int position) {//agrega un nodo en la posicion deseada
        Node newNode = new Node(data);                    // se crea el nodo que se va a ingresar
        Node anterior = head;                             // No se como llamarlo pero seria un pivote para pararnos en la pos anterior de
                                                          // la deseada
        int count = 1;
        while (count < position - 1) {                    // cuando el contador tome el ultimo valor( el anterior a la pos) ahi se pondra
                                                          // el valor del pivore
            anterior = anterior.next;
            count++;
        }
        Node current = anterior.next;                     // acá se creara un nodo temporal para guardar el valor siguiente
        newNode.next = current;                           // se "une" el nuevo nodo con el current
        anterior.next = newNode;                          // se "une" el anterior nodo al nuevo anterior
    }

    public void borrar(int position) {// borra un nodo en una posicion
        Node anterior = head;
        int count = 1;
        while (count < position - 1) {
            anterior = anterior.next;
            count++;
        }
        anterior = anterior.next.next;                     // se une el nodo anterior y el de despues del borrado
    }

    public void deleteWithValue(String data) {// borra el nodo que tiene el valor pedido
        if (head == null)
            return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
            }
        }
    }

    public boolean buscar(String data) {//busca un dato y devuelve en la posicion en la que está
        Node current = head;
        while (current.next != null) {
            if (current.data == data) {
                System.out.print(current);
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
