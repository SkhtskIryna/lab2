import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class Task1Test {

    @Test
    public void testSort_allEven() {
        int[] inputArray = {16, 4, 2, 6};
        List<Integer> expected = Arrays.asList(2, 4, 6, 16);
        List<Integer> b = Task1.sortEvenOdd(inputArray);
        assertEquals(expected, b);
    }

    @Test
    public void testSort_allOdd() {
        int[] inputArray = {9, 17, 1, 3};
        List<Integer> expected = Arrays.asList(17, 9, 3, 1);
        List<Integer> b = Task1.sortEvenOdd(inputArray);
        assertEquals(expected, b);
    }

    @Test
    public void testSort_mixed() {
        int[] inputArray = {9, 6, 1, 2};
        List<Integer> expected = Arrays.asList(2, 6, 9, 1);
        List<Integer> b = Task1.sortEvenOdd(inputArray);
        assertEquals(expected, b);
    }
}
