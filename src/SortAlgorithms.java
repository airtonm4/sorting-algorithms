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

}
