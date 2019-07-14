package net.yidooo.algorithm.sort;

public class MergeSort {
    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private static void sort(int [] array, int low, int high) {
        if(low >= high) {
            return ;
        }
        int mid = (low + high) / 2;
        sort(array, low, mid);
        sort(array, mid + 1, high);
        merge(array, low, mid, high);
    }

    private static void merge(int[] array, int low, int mid, int high) {
        int[] aux = new int[array.length];
        for(int i = low; i <= high; i++) {
            aux[i] = array[i];
        }

        int i = low;
        int j = mid + 1;
        int k = low;
        while(i <= mid && j <= high) {
            if(aux[i] < aux[j]) {
                array[k++] = aux[i++];
            } else {
                array[k++] = aux[j++];
            }
        }
        while(i <= mid) {
            array[k++] = aux[i++];
        }
        while(j <= high) {
            array[k++] = aux[j++];
        }
    }
}
