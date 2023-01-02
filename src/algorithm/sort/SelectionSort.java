package algorithm.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {20, 35, -15, 7, 55, 1, -22};


        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int indexOfMax = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (arr[i] > arr[indexOfMax]) {
                    indexOfMax = i;
                }
            }
            swap(arr, indexOfMax, lastUnsortedIndex);

        }

        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int[] arr, int i, int j) {
        if (i == j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}
