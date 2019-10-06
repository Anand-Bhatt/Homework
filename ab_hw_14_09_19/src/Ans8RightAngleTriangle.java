import java.util.Scanner;

public class Ans8RightAngleTriangle {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        c = sc.nextInt();
        for (int i = 0; i <= c; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("@ ");
            }
            System.out.println("");
        }
    }
}
