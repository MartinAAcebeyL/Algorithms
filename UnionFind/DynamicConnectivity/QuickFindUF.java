package UnionFind.DynamicConnectivity;


class QuickFindUF {
    private int id[];

    QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i; // each object is in its own component
        }
    }

    void union(int p, int q) {
        // add connection between p and q
        int pid = find(p);
        int qid = find(q);

        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid)
                id[i] = qid;
        }
    }

    boolean connected(int p, int q) {
        // are p and q in the same component?
        return id[p] == id[q];
    }

    int find(int p) {
        // component identifier for p (0 to n-1)
        return id[p];
    }

    int count() {
        // number of components
        return id.length;
    }
}