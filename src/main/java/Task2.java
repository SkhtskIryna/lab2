import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        if (isUniqueSet(a)) {
            System.out.println("The elements form a set");
        } else {
            System.out.println("The elements don't form a set");
        }
    }

    public static boolean isUniqueSet(int[] a) {
        Set<Integer> uniqueElements = new HashSet<>();

        for (int num : a) {
            if (!uniqueElements.add(num)) {
                return false;
            }
        }
        return true;
    }
}

