import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Task4Test {
    @Test
    public void test_noDuplicates() {
        int[] inputArray = {12, 8, 2, 9, 5};
        List<Integer> expectedIndices = new ArrayList<>();
        List<Integer> result = Task4.duplicateElements(inputArray);
        assertEquals(expectedIndices, result);
    }

    @Test
    public void test_withDuplicates() {
        int[] inputArray = {8, 1, 56, 1, 2, 1};
        List<Integer> expectedIndices = Arrays.asList(1, 3, 5);
        List<Integer> result = Task4.duplicateElements(inputArray);
        assertEquals(expectedIndices, result);
    }
}
