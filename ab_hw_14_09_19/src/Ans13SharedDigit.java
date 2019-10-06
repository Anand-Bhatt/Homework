import java.util.Scanner;

public class Ans13SharedDigit {
    public static void main(String[] args) {

        System.out.print("Enter your first No -  ");
        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();
        System.out.print("Enter your Second No -  ");
        int num2= sc.nextInt();
        System.out.print("\tGiven number has Shared Digit: " + hasSharedDigit(num1,num2));
    }
    public static boolean hasSharedDigit(int a ,int b){

        if(( a >= 10 && a <= 99) && (b >= 10 && b <= 99)){
            return true;

        } else {
            return false;
        }
    }

}