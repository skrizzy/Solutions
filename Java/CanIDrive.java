import java.util.Scanner;

public class CanIDrive {
    public static void main(String[] args) {
        System.out.print("Please enter your age: ");
        int age = new Scanner(System.in).nextInt();
        System.out.print(age >= 16 ? "\nYou can drive!" : "\nYou can't drive.");
    }
}
