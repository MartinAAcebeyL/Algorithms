package Sort;

public class SelectionSort {
    public static void sort(int[] a) {
        // El elemento mas pequenio lo cambiamos con i
        int len = a.length;

        for (int i = 0; i < len; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int aux = a[i];
            a[i] = a[min];
            a[min] = aux;
        }
    }
}
