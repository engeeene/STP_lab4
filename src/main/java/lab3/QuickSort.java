
package lab3;

public class QuickSort implements Sort {

    public void sort(int[] arr) {
        quicksort(0, arr.length - 1, arr);
    }

    private void quicksort(int low, int high, int[] arr) {
        int i = low, j = high;
        int pivot = arr[low + (high-low)/2];

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quicksort(low, j, arr);
        if (i < high)
            quicksort(i, high, arr);
    }
}
