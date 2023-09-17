package stacks;

class Node {
    public int item;
    public Node next;

    Node(int _item) {
        this.item = _item;
        this.next = null;
    }

}

public class StackofInts {
    private Node tope;
    private int tamanio;

    public StackofInts() {
        this.tope = null;
        this.tamanio = 0;

    }

    void push(int item) {
        Node newNode = new Node(item);
        if (isEmpty())
            tope = newNode;
        else {
            newNode.next = tope;
            tope = newNode;
        }
        tamanio++;
    }

    int pop() {
        int data = tope.item;
        tope = tope.next;
        tamanio--;
        return data;
    }

    boolean isEmpty() {
        return tope == null;
    }

    int size() {
        return tamanio;
    }
}
