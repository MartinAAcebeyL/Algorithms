package Sort;

public class InsertionSort {
    public static void sort(int[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    int aux = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = aux;
                } else
                    break;
            }
        }
    }
}
