import java.util.Scanner;

public class Ans2MinAndMaxInputChallenge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many number would you like to enter: ");

        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            a[i] = scan.nextInt();
        }
        int min = a[0], max = a[0];
        for (int i = 0; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
            }
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("\n\tMaximum value is: " + max);
        System.out.println("\tMinimum value is: " + min);

    }
}