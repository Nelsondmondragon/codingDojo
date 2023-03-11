import java.util.Objects;

public class DLL {
    public Node head;
    public Node tail;

    public DLL() {
        this.head = null;
        this.tail = null;
    }

    public void push(Node newNode) {
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }

        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;
    }

    public void printValuesForward() {
        Node current = this.head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public void printValuesBackward() {
        Node current = this.tail;
        while (current != null) {
            System.out.println(current.value);
            current = current.previous;
        }
    }


    public Node pop() {
        Node lastNode = this.tail;
        this.tail = lastNode.previous;
        this.tail.next = null;
        return lastNode;
    }

    public boolean contains(Integer value) {
        Node current = this.head;
        while (current != null) {
            if (Objects.equals(current.value, value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }


    public int size() {
        Node current = this.head;
        int size = 0;
        while (current != null) {
            current = current.next;
            size++;
        }
        return size;
    }

    public void insertAt(Node newNode, int index) {

        Node current = this.head;
        int indexList = 0;
        while (current != null) {
            if (indexList == index) {
                current.previous.next = newNode;
                newNode.previous = current.previous;
                newNode.next = current;
                current.previous = newNode;
            }
            current = current.next;
            indexList++;
        }


    }


    void removeAt(int index) {
        Node current = this.head;
        int indexList = 0;
        while (current != null) {
            if (indexList == index) {
                if (index == 0) {
                    this.head = current.next;
                    this.head.previous = null;
                } else {
                    current.next.previous = current.previous;
                    current.previous.next = current.next;
                }
            }
            current = current.next;
            indexList++;
        }

    }

    //No se entiende lo que piden
//    void isPalindrome(){
//        Node current = this.head;
//        while (current != null) {
//
//            current = current.next;
//        }
//
//    }
}
