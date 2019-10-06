import java.util.Scanner;

public class Ans12PrimeNumber {
    public static void main(String[] args) {
        Ans12PrimeNumber prime = new Ans12PrimeNumber();
        prime.isPrimeNumber();
    }

    public void isPrimeNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int num = sc.nextInt();
        if (num > 1 && num % 1 == 0 && num / num == 1) {
            System.out.println("Given number -  " + num + " is Prime Number.");
        } else {
            System.out.println("Given number " + num + "is not prime number: ");
        }
    }
}



