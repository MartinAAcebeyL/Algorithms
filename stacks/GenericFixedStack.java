package stacks;

public class GenericFixedStack<Item> {
    private Item[] s;
    private int N = 0;

    public GenericFixedStack(int capacity) {
        s = (Item[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(Item item) {
        s[N++] = item;
    }

    public Item pop() {
        return s[--N];
    }
}
