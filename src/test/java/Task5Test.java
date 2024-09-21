import org.junit.Test;

import java.util.Arrays;
import static org.junit.Assert.assertArrayEquals;

public class Task5Test {
    @Test
    public void test_noDuplicates() {
        int[] inputArray = {6, 2, 10, 21, 1};
        int[] expectedArray = {};
        int[] result = Task5.repeatElements(inputArray);
        assertArrayEquals(expectedArray, result);
    }

    @Test
    public void test_withDuplicates() {
        int[] inputArray = {8, 7, 3, 3, 9, 7, 10};
        int[] expectedArray = {3, 7};
        int[] result = Task5.repeatElements(inputArray);
        Arrays.sort(result);
        Arrays.sort(expectedArray);
        assertArrayEquals(expectedArray, result);
    }
}
