import java.util.Arrays;
import java.util.Scanner;

public class Ans18ArrayContainSpecificValue {
    public static void main(String[] args) {
        int[] ar1 = {45, 457, 68, 2, 121, 63, 89,};

        System.out.println("Numbers in Array:" + Arrays.toString(ar1));
        System.out.println("Enter the number to check: ");
        Scanner sc = new Scanner(System.in);
        int toCheckValue = sc.nextInt();
        ArrayValue(ar1, toCheckValue);
    }
    private static void ArrayValue(int[] ar2, int toCheckValue) {
        boolean check = false;
        for (int element : ar2) {
            if (element == toCheckValue) {
                check = true;
                break;
            }
        }
        System.out.println("Is " + toCheckValue + " present in the array: " + "\n" + check);
    }
}
