public class Main {
    public static void main(String[] args)  {
        System.out.println(args[0] + " " + args[1]);

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

        int iteration = 0;
        while (iteration < 5) {
            System.out.println(iteration);
            iteration++;
        }
    }
}
