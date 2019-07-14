package net.yidooo.algorithm.sort;

public class QuickSort {
    public static void sort(int[] array) {
        if(array != null) {
            sort(array, 0, array.length - 1);
        }
    }

    private static void sort(int[] array, int low, int high) {
        if(low > high) {
            return ;
        }
        int p = partition(array, low, high);
        sort(array, low, p - 1);
        sort(array, p + 1, high);
    }

    private static int partition(int[] array, int low, int high) {
        int v = array[low];
        int i = low;
        int j = high;
        while(i < j) {
            while(i < j && array[j] > v) {
                j--;
            }
            if(i < j) {
                array[i] = array[j];
                i++;
            }
            while(i < j && array[i] < v) {
                i++;
            }
            if(i < j) {
                array[j] = array[i];
                j--;
            }
        }
        array[i] = v;

        return i;
    }
}
