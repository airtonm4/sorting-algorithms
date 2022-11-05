import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        GenerateVetor arrays = new GenerateVetor();

        insertionSort(arrays);
        System.out.println();
        shellSort(arrays);
        System.out.println();
        heapSort(arrays);
        System.out.println();
        quickSort(arrays);

    }

    public static void insertionSort(GenerateVetor arrays) {

        long start;
        long end;
        long[] execTime = new long[50];
        long averageTime = 0;
        long[] allTimes = new long[10];

        // oneThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.InsertionSort(arrays.oneThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[0] = averageTime;

        averageTime = 0;

        // twoThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.InsertionSort(arrays.twoThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[1] = averageTime;

        averageTime = 0;

        // threeThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.InsertionSort(arrays.threeThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[2] = averageTime;

        averageTime = 0;

        // fourThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.InsertionSort(arrays.fourThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[3] = averageTime;

        averageTime = 0;

        // fiveThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.InsertionSort(arrays.fiveThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[4] = averageTime;

        averageTime = 0;

        // sixThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.InsertionSort(arrays.sixThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[5] = averageTime;

        averageTime = 0;

        // sevenThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.InsertionSort(arrays.sevenThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[6] = averageTime;

        averageTime = 0;

        // eightThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.InsertionSort(arrays.eightThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[7] = averageTime;

        averageTime = 0;

        // nineThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.InsertionSort(arrays.nineThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[8] = averageTime;

        averageTime = 0;

        // tenThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.InsertionSort(arrays.tenThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;

        }

        averageTime = averageTime / 50;

        allTimes[9] = averageTime;

        averageTime = 0;

        System.out.println(Arrays.toString(allTimes));
    }

    public static void shellSort(GenerateVetor arrays) {

        long start;
        long end;
        long[] execTime = new long[50];
        long averageTime = 0;
        long[] allTimes = new long[10];

        // oneThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.ShellSort(arrays.oneThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[0] = averageTime;

        // twoThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.ShellSort(arrays.twoThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[1] = averageTime;

        // threeThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.ShellSort(arrays.threeThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[2] = averageTime;

        // fourThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.ShellSort(arrays.fourThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[3] = averageTime;

        // fiveThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.ShellSort(arrays.fiveThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[4] = averageTime;

        // sixThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.ShellSort(arrays.sixThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[5] = averageTime;

        // sevenThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.ShellSort(arrays.sevenThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[6] = averageTime;

        // eightThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.ShellSort(arrays.eightThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[7] = averageTime;

        // nineThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.ShellSort(arrays.nineThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[8] = averageTime;

        // tenThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.ShellSort(arrays.tenThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[9] = averageTime;

        System.out.println(Arrays.toString(allTimes));
    }

    public static void heapSort(GenerateVetor arrays) {

        long start;
        long end;
        long[] execTime = new long[50];
        long averageTime = 0;
        long[] allTimes = new long[10];

        // oneThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.HeapSort(arrays.oneThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[0] = averageTime;

        // twoThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.HeapSort(arrays.twoThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[1] = averageTime;

        // threeThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.HeapSort(arrays.threeThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[2] = averageTime;

        // fourThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.HeapSort(arrays.fourThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[3] = averageTime;

        // fiveThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.HeapSort(arrays.fiveThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[4] = averageTime;

        // sixThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.HeapSort(arrays.sixThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[5] = averageTime;

        // sevenThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.HeapSort(arrays.sevenThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[6] = averageTime;

        // eightThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.HeapSort(arrays.eightThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[7] = averageTime;

        // nineThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.HeapSort(arrays.nineThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[8] = averageTime;

        // tenThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.HeapSort(arrays.tenThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;
        }

        averageTime = averageTime / 50;

        allTimes[9] = averageTime;

        System.out.println(Arrays.toString(allTimes));
    }

    public static void quickSort(GenerateVetor arrays) {

        long start;
        long end;
        long[] execTime = new long[50];
        long averageTime = 0;
        long[] allTimes = new long[10];

        // oneThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.QuickSort(arrays.oneThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;

        }

        averageTime = averageTime / 50;

        allTimes[0] = averageTime;

        // twoThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.QuickSort(arrays.twoThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;

        }

        averageTime = averageTime / 50;

        allTimes[1] = averageTime;

        // threeThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.QuickSort(arrays.threeThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;

        }

        averageTime = averageTime / 50;

        allTimes[2] = averageTime;

        // fourThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.QuickSort(arrays.fourThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;

        }

        averageTime = averageTime / 50;

        allTimes[3] = averageTime;

        // fiveThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.QuickSort(arrays.fiveThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;

        }

        averageTime = averageTime / 50;

        allTimes[4] = averageTime;

        // sixThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.QuickSort(arrays.sixThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;

        }

        averageTime = averageTime / 50;

        allTimes[5] = averageTime;

        // sevenThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.QuickSort(arrays.sevenThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;

        }

        averageTime = averageTime / 50;

        allTimes[6] = averageTime;

        // eightThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.QuickSort(arrays.eightThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;

        }

        averageTime = averageTime / 50;

        allTimes[7] = averageTime;

        // nineThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.QuickSort(arrays.nineThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;

        }

        averageTime = averageTime / 50;

        allTimes[8] = averageTime;

        // tenThousand exec time
        for (int i = 0; i < 50; i++) {
            start = System.nanoTime();
            SortAlgorithms.QuickSort(arrays.tenThousand.clone());
            end = System.nanoTime();

            execTime[i] = end - start;
        }

        for (long time : execTime) {
            averageTime += time;

        }

        averageTime = averageTime / 50;

        allTimes[9] = averageTime;

        System.out.println(Arrays.toString(allTimes));

    }
}
