import java.util.Scanner;

public class Ans10ArmstrongNumber {
    public static void main(String[] args) {
        isArmstrongNumber();
    }

    public static void isArmstrongNumber() {
        int x = 0;
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        a = sc.nextInt();
        int temp = a;

        while (a > 0) {
            b = a % 10;
            a = a / 10;
            x = x + (b * b * b);
        }
        if (x == temp) {
            System.out.println("The given number is Armstrong number");
        } else {
            System.out.println("This is not Armstrong number");
        }
    }
}
