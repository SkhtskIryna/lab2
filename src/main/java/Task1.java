import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        List<Integer> b = sortEvenOdd(a);

        System.out.println("\n---- Result ----");
        System.out.println("Array b: ");
        for (int num : b) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> sortEvenOdd(int[] a) {
        List<Integer> evenElements = new ArrayList<>();
        List<Integer> oddElements = new ArrayList<>();

        for (int num : a) {
            if (num % 2 == 0) {
                evenElements.add(num);
            } else {
                oddElements.add(num);
            }
        }

        Collections.sort(evenElements);
        oddElements.sort(Collections.reverseOrder());

        List<Integer> b = new ArrayList<>();
        b.addAll(evenElements);
        b.addAll(oddElements);

        return b;
    }
}