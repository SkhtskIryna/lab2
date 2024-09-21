import java.util.*;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("\n---- Duplicate elements ----");
        duplicateElements(a);
    }

    static List<Integer> duplicateElements(int[] a) {
        Map<Integer, List<Integer>> duplicatesMap = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            duplicatesMap.computeIfAbsent(a[i], k -> new ArrayList<>()).add(i);
        }

        List<Integer> duplicateIndices = new ArrayList<>();

        for (Map.Entry<Integer, List<Integer>> entry : duplicatesMap.entrySet()) {
            if (entry.getValue().size() > 1) {
                duplicateIndices.addAll(entry.getValue());
                System.out.println("Index " + entry.getValue() + ": " + entry.getKey());
            }
        }

        return duplicateIndices;
    }
}
