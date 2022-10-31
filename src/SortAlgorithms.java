import java.util.Arrays;

public class SortAlgorithms {

    public static void InsetionSort(int[] array) {
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            int aux = array[i];
            j = i;

            while (j > 0 && aux <= array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = aux;
        }

        System.out.println(Arrays.toString(array));
    }

    public static void ShellSort(int[] array) {
        int n = array.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            System.out.println(gap);
            for (int i = gap; i < n; i++) {
                int key = array[i];
                int j = i;

                while (j >= gap && array[j - gap] > key) {
                    array[j] = array[j - gap];
                    j -= gap;
                }

                array[j] = key;
                System.out.println(Arrays.toString(array));
            }
        }

        System.out.println(Arrays.toString(array));
    }

    // QuickSort

    public static void QuickSort(int[] array) {
        sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array) + "\n");

        for (int i = 0; i < 50; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    private static void sort(int[] array, int init, int end) {
        if (init < end) {
            int pivot = partition(array, init, end);
            // System.out.println(Arrays.toString(array));
            sort(array, init, pivot - 1);
            sort(array, pivot + 1, end);
        }
    }

    private static int partition(int[] array, int init, int end) {
        int pivot = array[init];
        int i = init + 1;
        int j = end;

        while (i <= j) {
            if (array[i] <= pivot) {
                i++;
            } else if (pivot < array[j]) {
                j--;
            } else {
                int change = array[i];

                array[i] = array[j];
                array[j] = change;

                i++;
                j--;
            }

        }

        array[init] = array[j];
        array[j] = pivot;
        return j;
    }

    // HeapSort

    public static void HeapSort() {
    }
}
