/* Dokument med if test, while løkke, for løkke og bruk av metoder */

public class Main {
    public static void main(String[] args)  {
       // If test

        int number = 3;
        if (number < 5) {
            System.out.println("Number is less than 5");
        }
        else if (number > 15) {
            System.out.println("Number is greater than 15");
        }
        else {
            System.out.println("Number is between 5 and 15");
        }

        // While loop
        System.out.println();
        int iteration = 0;
        while (iteration < 5) {
            System.out.println(iteration);
            iteration++;
        }

        // For loop
        System.out.println();
        for (int x = 0; x < 5; x++) {
            System.out.println(x);
        }

        System.out.println();
        for (int x = 100; x >= 0; x--) {
            System.out.println(x);
        }

        System.out.println();
        for (int x= 0; x < 10; x += 3) {
            System.out.println(x);
        }

        printHelloWorld();
        printNumberTo(10);
        System.out.println(returnPie());
    }

    public static void printHelloWorld() {
        System.out.println("Hello World!");
    }

    public static void printNumberTo(int endNumber) {
        for (int x = 1; x <= endNumber; x++) {
            System.out.println(x);
        }
    }

    public static double returnPie() {
        return Math.PI;
    }
}
