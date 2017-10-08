
package lab3;

import java.util.Arrays;

public class Sorting {
    public void start(int num, int n, int[] arr){
        Metrics metrics = new Metrics();
        for (int i = 0; i<n; i++) {
            switch(num) {
                case 1:
                    metrics.start();
                    BubbleSort bubbleSort = new BubbleSort();
                    bubbleSort.sort(arr);
                    metrics.stop();
                    System.out.format("%10d nano seconds and %10d bytes for Bubble Sort%n", metrics.getTime(), metrics.getMemory());
                    break;
                case 2:
                    metrics.start();
                    CombSort combSort = new CombSort();
                    combSort.sort(arr);
                    metrics.stop();
                    System.out.format("%10d nano seconds and %10d bytes for Comb Sort%n", metrics.getTime(), metrics.getMemory());
                    break;
                case 3:
                    metrics.start();
                    QuickSort quickSort = new QuickSort();
                    quickSort.sort(arr);
                    metrics.stop();
                    System.out.format("%10d nano seconds and %10d bytes for Quick Sort%n", metrics.getTime(), metrics.getMemory());
                    break;
                case 4:
                    metrics.start();
                    ShellSort shellSort = new ShellSort();
                    shellSort.sort(arr);
                    metrics.stop();
                    System.out.format("%10d nano seconds and %10d bytes for Shell Sort%n", metrics.getTime(), metrics.getMemory());
                    break;
                case 5:
                    metrics.start();
                    HeapSort heapSort = new HeapSort();
                    heapSort.sort(arr);
                    metrics.stop();
                    System.out.format("%10d nano seconds and %10d bytes for Heap Sort%n", metrics.getTime(), metrics.getMemory());
                    break;
                case 6:
                    metrics.start();
                    Arrays.sort(arr);
                    metrics.stop();
                    System.out.format("%10d nano seconds and %10d bytes for Arrays.Sort()%n", metrics.getTime(), metrics.getMemory());
                    break;
            }
        }
        System.out.println();
    }

}
