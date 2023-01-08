package algorithm.search;

public class BinarySearch {

    public static void main(String[] args) {
        System.out.println(search(new long[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 1));
    }

    private static long search(long[] array, long target) {

        int start = 0;
        int end = array.length;

        while (end >= start) {
            int mid = (start + end) / 2;

            if (target > array[mid]) {
                start = mid + 1;
            } else if (target < array[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return 0;
    }

}
