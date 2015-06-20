import java.util.Random;
import java.util.Scanner;

public class ComputerNumberGuess {
    Random random;
    Scanner userInput;
    int computersNumber;
    int userGuess;
    int numGuesses;
    boolean userWon;

    public static void main(String[] args) {
        ComputerNumberGuess game = new ComputerNumberGuess();
        game.play();
    }

    public void play() {
        random = new Random();
        computersNumber = random.nextInt(50) + 1;

        userInput = new Scanner(System.in);
        userGuess = 0;
        numGuesses = 5;

        userWon = false;

        System.out.println("Let's play a game! I'll think of a number" +
            " between 1 and 50 (inclusive), and you'll guess it! ");
        System.out.print("Ready to play? Say \"yes\" if you are. ");
        if (userInput.next().toLowerCase().substring(0, 3).equals("yes")) {
            while (true) {
                System.out.println("\nYou have " + numGuesses + (numGuesses > 1 ? " guesses." : " guess."));
                System.out.print("Please enter your guess: ");
                userGuess = userInput.nextInt();

                if (numGuesses > 1) {
                    if (userGuess > computersNumber)
                        System.out.println("Your guess was too high");
                    else if (userGuess < computersNumber)
                        System.out.println("Your guess was too low.");
                    else {
                        userWon = true;
                        break;
                    }
                    numGuesses--;
                } else {
                    if (userGuess == computersNumber) userWon = true;
                    break;
                }
            }
        }

        if (userWon)
            System.out.println("Congratulations, you won! Good job.");
        else
            System.out.println("Sorry, you lost. The number was " + computersNumber + ".");

        System.out.print("Do you want to play again? Say \"yes\" if you do. ");
        if (userInput.next().toLowerCase().substring(0, 3).equals("yes"))
            play();
    }
}
