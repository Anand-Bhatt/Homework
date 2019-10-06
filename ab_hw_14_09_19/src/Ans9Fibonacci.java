import java.util.Scanner;

public class Ans9Fibonacci {
    public static void main(String[] args) {
     int n1 = 0,n2 = 0,sum = 1, n,i;
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i = 1; i <=n; i++) {
            n1=n2;
            n2=sum;
            sum = n1+n2;
            System.out.print(n1+ " ");

        }
    }
}
