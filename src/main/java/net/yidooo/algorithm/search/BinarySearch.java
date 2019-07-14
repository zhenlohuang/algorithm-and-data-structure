package net.yidooo.algorithm.search;

public class BinarySearch {
    private static final int NO_FOUND = -1;

    public static int search(int[] array, int target) {
        if(array != null && array.length != 0) {
            int low = 0;
            int high = array.length - 1;
            while(low <= high) {
                int mid = (low + high) / 2;
                if(array[mid] == target) {
                    return mid;
                } else if(array[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }

        return NO_FOUND;
    }
}
