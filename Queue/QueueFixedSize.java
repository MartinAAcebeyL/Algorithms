package Queue;

public class QueueFixedSize {
    private int[] array;
    private int size, first, last;

    public QueueFixedSize(int size) {
        this.array = new int[size];
        this.size = size;
        this.first = 0;
        this.last = 0;
    }

    public void push(int value) {
        if (this.last < this.size) {
            this.array[this.last] = value;
            this.last++;
        }
    }

    public int pop() {
        if (this.last > 0) {
            int temp = this.array[this.first];
            this.first++;
            return temp;
        }
        return -1;
    }
}
