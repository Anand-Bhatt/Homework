import java.text.DecimalFormat;
import java.util.Scanner;

public class Ans17AverageValueOfArray {
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {

        System.out.println("How many numbers do you want enter?");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        double[] arr = new double[a];
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\tValue " + (i + 1) + " = ");
            arr[i] = sc.nextDouble();
        }
        sc.close();
        for (double v : arr) {
            sum = sum + v;
        }
        double avr = sum / arr.length;
        System.out.println("\nThe average of given numbers: " + df2.format(avr));
    }
}
