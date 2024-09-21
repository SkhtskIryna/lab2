import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Task3Test {
    @Test
    public void test_uniqueElementsPresent() {
        int[] inputArray = {1, 2, 3, 2, 4, 5, 5};
        List<Integer> expectedIndices = Arrays.asList(0, 2, 4);
        List<Integer> result = Task3.uniqueElements(inputArray);
        assertEquals(expectedIndices, result);
    }

    @Test
    public void test_allUnique() {
        int[] inputArray = {6, 2, 7, 4, 3};
        List<Integer> expectedIndices = Arrays.asList(0, 1, 2, 3, 4);
        List<Integer> result = Task3.uniqueElements(inputArray);
        assertEquals(expectedIndices, result);
    }
}
