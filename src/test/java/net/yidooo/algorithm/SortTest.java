package net.yidooo.algorithm;

import net.yidooo.algorithm.sort.MergeSort;
import net.yidooo.algorithm.sort.QuickSort;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortTest {
    private static final int[] UNSORTED_ARRAY = new int[]{2, 1, 4, 3, 5};
    private static final int[] SORTED_ARRAY = new int[]{1, 2, 3, 4, 5};

    @Test
    public void testQuickSort() {
        int[] array = UNSORTED_ARRAY.clone();
        QuickSort.sort(array);
        Assert.assertEquals(array, SORTED_ARRAY);
    }

    @Test
    public void testMergeSort() {
        int[] array = UNSORTED_ARRAY.clone();
        MergeSort.sort(array);
        Assert.assertEquals(array, SORTED_ARRAY);
    }
}
