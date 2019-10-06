import java.util.Scanner;

public class Ans3VowelOrConsonant {
    public static void main(String[] args) {
        System.out.println("Enter any alphabet: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if (ch >= '0' && ch <= '9') {
            System.out.println("Invalid input");
        }
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.print("\tGiven alphabet " + ch + " is vowel");
        } else
            System.out.print(" \tGiven alphabet " + ch + " is consonant ");
    }
}
