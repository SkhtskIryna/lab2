import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Task2Test {
    @Test
    public void test_allUnique() {
        int[] inputArray = {1, 5, 4, 3, 2};
        assertTrue(Task2.isUniqueSet(inputArray));
    }

    @Test
    public void test_withDuplicates() {
        int[] inputArray = {2, 3, 1, 1, 4};
        assertFalse(Task2.isUniqueSet(inputArray));
    }
}

