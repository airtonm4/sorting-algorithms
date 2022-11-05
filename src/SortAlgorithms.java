public class SortAlgorithms {

    public static void InsertionSort(int[] array) {
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

    }

    public static void ShellSort(int[] array) {
        int n = array.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = array[i];
                int j = i;

                while (j >= gap && array[j - gap] > key) {
                    array[j] = array[j - gap];
                    j -= gap;
                }

                array[j] = key;
            }
        }

    }

    // QuickSort

    public static void QuickSort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int init, int end) {
        if (init < end) {
            int pivot = partition(array, init, end);
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

    public static void HeapSort(int[] array) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heap(array, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heap(array, i, 0);
        }
    }

    private static void heap(int[] array, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && array[l] > array[largest])
            largest = l;

        if (r < n && array[r] > array[largest])
            largest = r;

        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            heap(array, n, largest);
        }
    }
}
