import lab3.*;
import org.junit.Test;
import static org.junit.Assert.*;


public class SortTest {
    private Sort sort;
    private Array array = new Array();

    @Test
    public void testBubbleSort() {
        sort = new BubbleSort();
        int[] arr = array.getArray();
        sort.sort(arr);
        for (int i = 1; i < arr.length - 1; i++ ){
            assertTrue("Array not sorted", arr[i-1] <= arr[i]);

        }
        //Array.print(arr);
    }

    @Test
    public void testCombSort() {
        sort = new CombSort();
        int[] arr = array.getArray();
        sort.sort(arr);
        for (int i = 1; i < arr.length - 1; i++ ){
            assertTrue("Array not sorted", arr[i-1] <= arr[i]);

        }
    }

    @Test
    public void testHeapSort() {
        sort = new HeapSort();
        int[] arr = array.getArray();
        sort.sort(arr);
        for (int i = 1; i < arr.length - 1; i++ ){
            assertTrue("Array not sorted", arr[i-1] <= arr[i]);

        }
    }

    @Test
    public void testQuickSort() {
        sort = new QuickSort();
        int[] arr = array.getArray();
        sort.sort(arr);
        for (int i = 1; i < arr.length - 1; i++ ){
            assertTrue("Array not sorted", arr[i-1] <= arr[i]);

        }
    }

    @Test
    public void testShellSort() {
        sort = new ShellSort();
        int[] arr = array.getArray();
        sort.sort(arr);
        for (int i = 1; i < arr.length - 1; i++ ){
            assertTrue("Array not sorted", arr[i-1] <= arr[i]);

        }
    }

}
