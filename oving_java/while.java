import java.util.Scanner;

public class while {
    public static void main (String[] args){
        //make random number
        // from 1 to 100
        int number = (int)(Math.random() * 100 + 1);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 1 and 100");
        int number_of_guesses = 0;
        while (true) {
            guess = input.nextInt();
            if (guess == number) {
                System.out.println("You guessed correctly!");
                break;
            }
            else if (guess > number) {
                System.out.println("Your guess is too high");
            }
            else {
                System.out.println("Your guess is too low");
            }
            number_of_guesses += 1;
        }
        System.out.println("The magic number was " + number);
        System.out.println("You guessed " + number_of_guesses + " times");
    }
}
