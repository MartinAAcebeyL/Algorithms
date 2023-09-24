package Queue;

class Node {
    String value;
    Node next;

    public Node(String value) {
        this.next = null;
        this.value = value;
    }
}

public class QueueOfStr {
    int size;
    Node firstNode;
    Node lasNode;

    public QueueOfStr() {
        this.size = 0;
        this.firstNode = null;
        this.lasNode = null;
    }

    public void push(String value) {
        Node newNode = new Node(value);

        if (isEmpty()) {
            this.firstNode = newNode;
            this.lasNode = newNode;
        } else {
            this.lasNode.next = newNode;
            this.lasNode = newNode;
        }

        this.size++;
    }

    public String pop() {
        Node auxNode = this.firstNode;
        this.firstNode = auxNode.next;

        this.size--;
        return auxNode.value;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }
}
