import java.util.Scanner;

public class Hangman {
    String[] wordBank = {"Camp Fitch Forever", "Computer Camp", "Quake Three",
        "Yosemite", "IntelliJ IDEA", "Java Is Awesome", "Hangman"};
    String guessedLetters = "";
    String wordToGuess;
    Boolean won = false;
    int lives = 6;
    String[] man = {
        "",
        "  __\n /..\\\n| __ |\n \\__/",
        "  __\n /..\\\n| __ |\n \\__/\n  |\n  |\n  |",
        "  __\n /..\\\n| __ |\n \\__/\n\\ |\n \\|\n  |",
        "  __\n /..\\\n| __ |\n \\__/\n\\ | /\n \\|/\n  |",
        "  __\n /..\\\n| __ |\n \\__/\n\\ | /\n \\|/\n  |\n /\n/",
        "  __\n /..\\\n| __ |\n \\__/\n\\ | /\n \\|/\n  |\n / \\\n/   \\"
    };

    public static void main(String[] args) {
        Hangman hangman = new Hangman();
        hangman.start();
    }

    public void start() {
        guessedLetters = "";
        lives = 6;
        won = false;
        Scanner scanner = new Scanner(System.in);
        wordToGuess = wordBank[(int)(Math.random() * wordBank.length)].toUpperCase();

        while(true) {
            // Print the man
            System.out.println(man[6 - lives]);

            // Print the word
            boolean allGuessed = true;
            for (int dracula = 0; dracula < wordToGuess.length(); dracula++) {
                if (guessedLetters.contains(wordToGuess
                        .toUpperCase().substring(dracula, dracula + 1)))
                    System.out.print(wordToGuess.substring(dracula, dracula + 1) + " ");
                else if (wordToGuess.substring(dracula, dracula + 1).equals(" "))
                    System.out.print("  ");
                else {
                    System.out.print("_ ");
                    allGuessed = false;
                }
            }
            System.out.print("\n");

            // Print the letters guessed
            System.out.println("You have guessed the following letters: " + guessedLetters);

            // Check to see if the game needs to end
            if (lives == 0) break;
            if (allGuessed) {
                won = true;
                break;
            }

            // Get a letter from the user
            System.out.println("Please guess another letter");
            String userGuess = "";
            while (true) {
                userGuess = scanner.next().substring(0, 1).toUpperCase();
                if (guessedLetters.contains(userGuess))
                    System.out.println("You already guessed that letter! " +
                        "Guess a different one.");
                else
                    break;
            }
            guessedLetters += userGuess.toUpperCase();
            if (! wordToGuess.toUpperCase().contains(userGuess)) lives--;
        }

        if (won) System.out.println("Congratulations, you won!");
        else System.out.println("Sorry, you lost. The word was " + wordToGuess + ".");
        System.out.print("Do you want to play again? Enter 'y' to play again " +
                        "or anything else to exit. ");
        if (scanner.next().substring(0, 1).toLowerCase().equals("y")) start();
    }
}
