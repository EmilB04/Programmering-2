import java.util.Scanner;

public class scanner{
    public static void main (String [] args){
        Scanner Input = new Scanner(System.in);  // Lager et Scanner objekt
        
        System.out.println("Hvor gammel er du? ");

        int age = Input.nextInt();  //  Leser input
        if (age >= 18) {
            System.out.println("Du er myndig!");
        }
        else {
            System.out.println("Du er ikke myndig!");
        }

        System.out.println("Du er " + age + " år gammel.");  // Output user input
    }
}
