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

    public static void HeapSort(int[] array) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heap(array, n, i);
        }

        System.out.println(Arrays.toString(array));
        System.out.println(isHeap(array, 0, n - 1));

        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heap(array, i, 0);
            System.out.println(Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));
        System.out.println(isHeap(array, 0, n - 1));
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

    public static boolean isHeap(int arr[], int i, int n) {
        // If (2 * i) + 1 >= n, then leaf node, so return true
        if (i >= (n - 1) / 2) {
            return true;
        }

        // If an internal node and
        // is greater than its
        // children, and same is
        // recursively true for the
        // children
        if (arr[i] >= arr[2 * i + 1]
                && arr[i] >= arr[2 * i + 2]
                && isHeap(arr, 2 * i + 1, n)
                && isHeap(arr, 2 * i + 2, n)) {
            return true;
        }

        return false;
    }
}
