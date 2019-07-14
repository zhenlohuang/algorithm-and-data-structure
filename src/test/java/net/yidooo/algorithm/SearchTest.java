package net.yidooo.algorithm;

import net.yidooo.algorithm.search.BinarySearch;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest {
    private static final int[] SORTED_ARRAY = new int[] {1, 2, 3, 4, 5};

    @Test
    public void testBinarySearch() {
        Assert.assertEquals(BinarySearch.search(SORTED_ARRAY, 4), 3);
    }
    
    @Test
    public void testBinarySearchNotFound() {
        Assert.assertEquals(BinarySearch.search(SORTED_ARRAY, 0), -1);
    }
}
