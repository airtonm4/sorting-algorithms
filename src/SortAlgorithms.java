import java.util.Arrays;

public class SortAlgorithms {

    public static void InsetionSort(Integer[] array) {
        Integer j = 0;

        for (int i = 0; i < array.length; i++) {
            Integer aux = array[i];
            j = i;

            while (j > 0 && aux <= array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = aux;
        }

        System.out.println(Arrays.toString(array));
    }

    public static void ShellSort(Integer[] array) {
        Integer n = array.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            System.out.println(gap);
            for (Integer i = gap; i < n; i++) {
                Integer key = array[i];
                Integer j = i;

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

    public static void QuickSort() {
    }

    public static void HeapSort() {
    }
}
