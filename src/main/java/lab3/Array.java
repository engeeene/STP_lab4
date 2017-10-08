
package lab3;

import java.util.Random;

public class Array {
    private int length = 150;
    private int[] arr;
    private Random rand = new Random();

    public Array() {
        arr = new int[length];
        for (int i=0; i < length; i++) {
            arr[i] = rand.nextInt();
        }
    }

    public Array(int length) {
        this.length = length;
        arr = new int[length];
        for (int i=0; i < length; i++) {
            arr[i] = rand.nextInt();
        }
    }

    public int getLength() {
        return length;
    }

    public int[] getArray() {
        return arr.clone();
    }

    public static void print(int[] arr){
        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
