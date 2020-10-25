public class Node{
    public Node left,rigth;
    public int data;

    public Node(int data){
        this.left=left;
        this.rigth=rigth;
        this.data=data;
    }


    public void insert(int value) {
        if (value <= data) {
            if (left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            }
        } else {
            if (rigth == null) {
                rigth = new Node(value);
            } else {
                rigth.insert(value);
            }
        }
    }

    public boolean contains(int value) {
        if (value == data) {
            return true;
        } else if (value < data) {
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        } else {
            if (rigth == null) {
                return false;
            } else {
                return rigth.contains(value);
            }
        }
    }

    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(data);

        if (rigth != null) {
            rigth.printInOrder();
        }
    }
        public void printPreOrder() {
            System.out.println(data);
        if (left != null) {
            left.printPreOrder();
        }
        

        if (rigth != null) {
            rigth.printPreOrder();
        }
    }

    public void printMayores(int value) {
        if (contains(value) == true) {
            if (value < data) {
                rigth.printPreOrder();
            }
        }
    }
}