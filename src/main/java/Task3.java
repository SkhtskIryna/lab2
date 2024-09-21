import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("\n---- Unique elements ----");
        uniqueElements(a);
    }

    static List<Integer> uniqueElements(int[] a) {
        Map<Integer, Integer> unique = new HashMap<>();
        for (int num : a) {
            unique.put(num, unique.getOrDefault(num, 0) + 1);
        }

        List<Integer> uniqueIndices = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (unique.get(a[i]) == 1) {
                uniqueIndices.add(i);
                System.out.println("Index " + i + ": " + a[i]);
            }
        }
        return uniqueIndices;
    }
}
