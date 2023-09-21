package stacks;

public class StackFixedSize {
    private int[] array;
    private int n;
    private int top;

    public StackFixedSize(int n) {
        this.array = new int[n];
        this.n = n;
        this.top = 0;
    }

    public void push(int value) {
        if (this.top < this.n) {
            this.array[this.top] = value;
            this.top++;
        }
    }

    public int pop() {
        if (this.top >= 0) {
            int temp = this.array[this.top];
            this.top--;
            return temp;
        }
        return -1;
    }
}