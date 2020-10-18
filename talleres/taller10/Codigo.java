public class Node {

    public Node left, rigth;
    public int data;

    public Node(int data) {
        this.left = null;
        this.rigth = null;
        this.data = data;
    }
}

public class BinaryTree {
    protected Node root;

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(int n) {
        this.root = new Node(n);
    }

    // Llama al metodo auxiliar insertar
    public void insertar(int n) {
        insertar1(root, n);
    }

    // Agrega un nodo al arbol
    private void insertar1(Node node, int n) {
        if (node.data == n) {
            return;
        } else if (n > node.data) {
            if (node.rigth == null) {
                node.rigth = new Node(n);
            } else {
                insertar1(node.rigth, n);
            }
        } else {
            if (node.left == null) {
                node.left = new Node(n);
            } else {
                insertar1(node.left, n);
            }
        }
    }

    // Llama al metodo auxiliar buscar
    public boolean buscar(int n) {
        return buscar1(root, n);
    }

    // Busca en el arbol si existe un valor, devuelve true o false, dependiendo de
    // si este o no
    private boolean buscar1(Node node, int n) {
        if (node == null) {
            return false;
        }
        if (node.data == n) {
            return true;
        }
        if (n > node.data) {
            return buscar1(node.rigth, n);
        }
        return buscar1(node.left, n);
    }

    // Llama al metodo auxiliar borrar
    public void borrar(int n) {
        borrarAux(root, n);
    }

    // Borra un nodo el arbol
    private Node borrarAux(Node node, int n) {
        if (node == null) {
            return null;
        }
        if (node.data == n) {
            if (node.rigth == null && node.left == null) {
                return null;
            }
            if (node.rigth == null) {
                return node.left;
            }
            if (node.left == null) {
                return node.rigth;
            } else {
                node.data = encontrarNodoReemplazo(node.left);
            }
        }
        if (n > node.data) {
            node.rigth = borrarAux(node.rigth, n);
            return node;
        }
        node.left = borrarAux(node.left, n);
        return node;
    }

    private int encontrarNodoReemplazo(Node n) {
        if (n.rigth == null) {
            int res = n.data;
            n = null;
            return res;
        }
        return encontrarNodoReemplazo(n.rigth);
    }

}
