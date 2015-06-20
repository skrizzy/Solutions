import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        for(int dracula = 1; dracula <= 100; dracula++) {
            String output = "";
            if (dracula % 3 == 0)
                output += "Fizz";
            if (dracula % 5 == 0)
                output += "Buzz";
            System.out.println(output.equals("") ? dracula : output);
        }
    }
}
