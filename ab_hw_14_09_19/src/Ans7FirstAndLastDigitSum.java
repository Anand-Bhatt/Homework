import java.util.Scanner;

public class Ans7FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.print(sumFirstAndLastDigit(i));
    }

    public static int sumFirstAndLastDigit(int num) {
        int a = num;
        if (a < 0) {
            System.out.println("\tInvalid Number");
            return -1;
        }
        int lastdigit = num % 10;
        while (a >= 10) {
            a = a / 10;
        }
        int firstdigit = a;
        System.out.println("\tThe sum of the given number is :");
        return firstdigit + lastdigit;
    }
}
