package Sort;

public class Main {
    public static void main(String[] args) {
        int[] array = { 64, 25, 12, 22, 11, 0, -1, 100 };

        System.out.println("Array antes de ordenar:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        SelectionSort.sort(array);

        System.out.println("\nArray después de ordenar:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
