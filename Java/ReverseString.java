import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter a word to be reversed.");
        String original = new Scanner(System.in).next();
        for (int dracula = original.length() - 1; dracula >= 0; dracula--) {
            System.out.print(original.substring(dracula, dracula + 1));
        }
    }
}
