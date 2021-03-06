package id.dondon.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ShellSortTest {

    @Test
    public void sort() {
        int listToSort[] = new int[] {3, 5, 6, 8, 10, 1, 2, 4, 7, 9};
        int expected[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ShellSort shellSort = new ShellSort();
        shellSort.print(listToSort);
        shellSort.sort(listToSort);

        assertArrayEquals(expected, listToSort);
    }

}
