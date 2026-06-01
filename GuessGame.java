import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secretNumber = 7;

        System.out.print("Guess the number (1-10): ");
        int guess = sc.nextInt();

        if (guess == secretNumber) {
            System.out.println("Correct! You guessed the number.");
        } else {
            System.out.println("Wrong guess! The number was " + secretNumber);
        }

        sc.close();
    }
}