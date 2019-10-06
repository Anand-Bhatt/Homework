import java.util.Scanner;

public class Ans6TriangleWithNumber {
    public static void main(String[] args) {
        isNumberTriangle();
    }

    public static void isNumberTriangle() {
        int i, j, line;
        System.out.println("Enter number of line: ");
        Scanner sc = new Scanner(System.in);
        line = sc.nextInt();
        for (i = 1; i <= line; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }

    }
}
