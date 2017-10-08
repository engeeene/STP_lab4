
package lab2;

import java.util.Scanner;

public class Array {

    private int[] arr;
    private int n;

    public Array() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array length");
        int n = in.nextInt();
        this.n = n;
        System.out.println("Enter " + n + " numbers");
        arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
    }

    public Array(int[] arr) {
        this.n = arr.length;
        this.arr = arr;
    }

    public double geometricMeanOfPairedArrayElements() {
        int sum = 0;
        for (int i=0; i<n; i = i + 2) {
            sum += arr[i];
        }
        double mean = Math.pow( sum, (1.0 / Math.ceil((double)n / 2)) );
        System.out.println("The geometric mean of paired array elements is " + mean);
        return mean;
    }

    public int maxModuleElement() {
        int max = Math.abs(arr[0]);
        for (int i=1; i<n; i++) {
            int num = Math.abs(arr[i]);
            if (num > max){
                max = num;
            }
        }
        System.out.println("The largest number by module of the array element is " + max);
        return max;
    }

    public int maxPairedElement() {
        Integer max= null;
        for (int i=0; i<n; i++) {
            int num = arr[i];
            if (num % 2 == 0){
                if (max == null) {
                    max = num;
                } else if (max != null && num > max) {
                    max = num;
                }
            }
        }
        if (max != null) {
            System.out.println("The maximum paired item in the array is " + max);
        } else {
            System.out.println("Array does not contain paired number");
        }
        return max;
    }

    public int minElement() {
        int min = arr[0];
        for (int i=1; i<n; i++) {
            int num = arr[i];
            if (num < min){
                min = num;
            }
        }
        System.out.println("The arithmetic mean of the minimum elements of the array is " + min);
        return min;
    }

    public int minModuleElement() {
        int min = Math.abs(arr[0]);
        for (int i=1; i<n; i++) {
            int num = Math.abs(arr[i]);
            if (num < min){
                min = num;
            }
        }
        System.out.println("The module-minimized array element is " + min);
        return min;
    }

    public int sumOfFirst(int m) {
        int sum = 0;
        int interval;
        if (m > n) {
            interval = n;
        } else {
            interval = m;
        }
        for (int i=0; i<interval; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of items in the interval [0," + (m - 1) + "] is " + sum);
        return sum;
    }


    public void print() {
        System.out.print("Array: ");
        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
