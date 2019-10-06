import java.util.Scanner;

public class Ans4DigitSumChallenge {
    public static void main(String[] args) {
//        System.out.println("The sum of number : -1 is: " + sumDigits(-1));
//        System.out.println("The sum of number: 321 is: " + sumDigits(321));
//        System.out.println("The sum of number: 123456 is: " + sumDigits(123456));
//    }
//
//    private static int sumDigits(int number) {
//        if (number >= 10) {
//            int sum = 0;
//            while (number > 0) {
//                int digit = number % 10;
//                sum += digit;
//                number /= 10;
//            }
//            return sum;
//        }
//        return -1;
        int i = 1, j = 0, b;
        boolean Num;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number you want add?");
        b = sc.nextInt();
        do {
            while (i <= b) {
                System.out.print("Enter Digit " + i + " : ");
                if (sc.hasNextInt()) {
                    j = j + sc.nextInt();
                    i++;
                    Num = true;
                } else {
                    System.out.println("Wrong Input , Please Enter Again : ");
                    Num = false;
                    sc.next();
                }
            }
        } while (Num = false);
        System.out.println("\tSum of given digits  :  " + j);
        sc.close();
    }
}
