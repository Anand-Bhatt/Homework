import java.util.Scanner;

public class Ans11EvenDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        isEvenDigitSum(num);
    }

    private static void isEvenDigitSum(int num) {
        int rem = 0;
        int sum = 0;

        if (num < 0) {
            System.out.println("Invalid number");
        }
        while (num > 0) {
            rem = num % 10;
            if (rem % 2 == 0) {
                sum = sum + rem;
            }
            num = num / 10;
        }
        System.out.println(" The sum of even numbers is: " + sum);
    }
}
