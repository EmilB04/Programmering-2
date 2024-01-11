package datatyper;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int number;
        number = 42;
        System.out.println(number);

        double decimalNumber = 3.14;
        System.out.println(decimalNumber);

        long longNumber = 1287000000000000L;
        System.out.println(longNumber);

        int sum = (int) (number + longNumber);
        System.out.println(sum);

        int sum2 = (int) decimalNumber;
        System.out.println(sum2);
        //---------------------------------------/
        number = (int) decimalNumber;
        System.out.println(number);

        // String
        System.out.println();
        String stringVariabel = "Hello World";
        System.out.println(stringVariabel);

        // Arrays
        System.out.println();
        String[] stringArray = new String[3];
        stringArray[0] = "Hello";
        stringArray[1] = "World";
        stringArray[2] = "!";
        System.out.println(Arrays.toString(stringArray));
    }
}