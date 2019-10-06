import java.util.Arrays;

public class Ans14NumericArrayOrStringArray {

    public static void main(String[] args) {
        int[] intarr = {45, 789, 2, 2001};

        String[] strarr = {"Anand", "Yatin", "Dev", "Daxesh"};
// For numeric values
        System.out.println("Original Numeric array: \t" + Arrays.toString(intarr));
        Arrays.sort(intarr);
        System.out.println("Sorted Numeric array: \t" + Arrays.toString(intarr));
//For string values
        System.out.println("\nOriginal string Array: \t" + Arrays.toString(strarr));
        Arrays.sort(strarr);
        System.out.println("Sorted String Array: " + Arrays.toString(strarr));
    }

}

