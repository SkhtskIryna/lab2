import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = repeatElements(a);
        System.out.println("Array b with repeated elements: " + Arrays.toString(b));
    }

    public static int[] repeatElements(int[] a) {
        Set<Integer> uniqueSet = new HashSet<>();
        Set<Integer> duplicatesSet = new HashSet<>();

        for (int num : a) {
            if (!uniqueSet.add(num)) {
                duplicatesSet.add(num);
            }
        }

        int[] b = new int[duplicatesSet.size()];
        int index = 0;
        for (int num : duplicatesSet) {
            b[index++] = num;
        }

        return b;
    }
}
