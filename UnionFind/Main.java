package UnionFind;


public class Main {
    public static void main(String[] args) {
        QuickFindUF uf = new QuickFindUF(10);
        uf.union(4, 3);
        uf.union(3, 8);
        uf.union(6, 5);
        uf.union(9, 4);
        uf.union(2, 1);
        System.out.println(uf.connected(0, 7));
        System.out.println(uf.connected(8, 9));

        uf.union(5, 0);
        uf.union(7, 2);
        uf.union(6, 1);
        uf.union(1, 0);
        System.out.println(uf.connected(0, 7));
    }
}
