import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * Classe para testar e gerar o relatório em um arquivo xls
 */
public class SortingTest {
    public static void main(String[] args) throws Exception {
        /**
         * Classe com os vetores a serem ordenados.
         */
        GenerateVetor arrays = new GenerateVetor();

        /**
         * Matriz com o tempo de execução dos algoritmos.
         */
        long[][] executionTimeMatriz = new long[4][10];

        /**
         * Foi decidido fazer dessa forma ocupando diversas linhas para evitar erros e
         * realizar um desenvolvimento rápido com baixo conhecimento sobre essa
         * linguagem.
         */
        executionTimeMatriz[0] = insertionSort(arrays);
        executionTimeMatriz[1] = shellSort(arrays);
        executionTimeMatriz[2] = heapSort(arrays);
        executionTimeMatriz[3] = quickSort(arrays);

        /*
         * Diretório do meu computador
         */
        String filename = "C:/Users/Airton/Documents/IFGoiano/Terms/fourthTerm/EDII/Trabalho1_ED2/Sorting.xls";

        /**
         * Classes utilizados para gerar um relatório em excell
         */
        FileOutputStream fileOutputStream = new FileOutputStream(filename);
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Times");

        HSSFRow rowhead = sheet.createRow(0);

        rowhead.createCell(0).setCellValue("Algorithm");
        rowhead.createCell(1).setCellValue("array");
        rowhead.createCell(2).setCellValue("execution time");

        for (int i = 0; i < executionTimeMatriz.length; i++) {
            // Algorithms
            for (int j = 0; j < executionTimeMatriz[i].length; j++) {
                // Times
                HSSFRow rows = sheet.createRow((j + 1) + i * 10);
                String algorithm = i == 0 ? "insertionSort" : i == 1 ? "shellSort" : i == 2 ? "heapSort" : "quickSort";

                rows.createCell(0).setCellValue(algorithm);
                rows.createCell(1).setCellValue((j + 1) * 1000);
                rows.createCell(2).setCellValue(executionTimeMatriz[i][j]);
            }
        }

        workbook.write(fileOutputStream);

        fileOutputStream.close();
        workbook.close();

    }

    /**
     * Método para receber os tempos de execução do insertionSort.
     * 
     * @param arrays
     * @return Tempo de execução
     */
    public static long[] insertionSort(GenerateVetor arrays) {

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

        // System.out.println(Arrays.toString(allTimes));
        return allTimes;
    }

    /**
     * Método para receber os tempos de execução do shellSort.
     * 
     * @param arrays
     * @return Tempo de execução
     */
    public static long[] shellSort(GenerateVetor arrays) {

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

        // System.out.println(Arrays.toString(allTimes));
        return allTimes;
    }

    /**
     * Método para receber os tempos de execução do heapSort.
     * 
     * @param arrays
     * @return Tempo de execução
     */
    public static long[] heapSort(GenerateVetor arrays) {

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

        // System.out.println(Arrays.toString(allTimes));
        return allTimes;
    }

    /**
     * Método para receber os tempos de execução do quickSort.
     * 
     * @param arrays
     * @return Tempo de execução
     */
    public static long[] quickSort(GenerateVetor arrays) {

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

        // System.out.println(Arrays.toString(allTimes));
        return allTimes;

    }
}
