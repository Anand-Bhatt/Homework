import java.util.Scanner;

public class Ans15SumValueOfArray {
    public static void main(String[] args) {

        int a, sum = 0;
        System.out.print("Enter length of an array: \t");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int[] b = new int[a];
        System.out.println("Enter numbers: ");

        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
            sum = sum + b[i];
        }
        System.out.println("Sum of all number = " + sum);
    }
}
