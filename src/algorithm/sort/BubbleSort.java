package algorithm.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
