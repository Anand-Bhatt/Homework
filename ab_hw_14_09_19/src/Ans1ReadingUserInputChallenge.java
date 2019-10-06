import java.util.Scanner;

public class Ans1ReadingUserInputChallenge {
    public static void main(String[] args) {

        int b, sum = 0, i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the numbers you want to sum: ");
        b = sc.nextInt();
        int[] a = new int[b];

        while (i < b) {
            System.out.print("\t Enter  number  " + (i + 1) + ": ");
            a[i] = sc.nextInt();
            sum += a[i];
            i++;
        }
        System.out.println("Sum is = " + sum);
    }
}