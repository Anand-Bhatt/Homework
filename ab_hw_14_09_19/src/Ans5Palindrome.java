import java.util.Scanner;

public class Ans5Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(isPalindrome(i));
    }

    public static boolean isPalindrome(int number) {
        boolean check = true;
        int rev = 0, rem = 0;
        int temp = number;
        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (number == rev) {
            check = true;
            System.out.println("Palindrome number");
        } else {
            check = false;
            System.out.println("Not Palindrome number");
        }
        return check;
    }
}