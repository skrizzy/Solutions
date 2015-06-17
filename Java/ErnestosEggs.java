import java.util.Scanner;

public class ErnestosEggs {
    public static void main(String[] args) {
        ErnestosEggs ernestosEggs = new ErnestosEggs();
        ernestosEggs.menu();
    }

    public void menu() {
        System.out.println("Do you want a table of prices or a price" +
                        " calculator? Enter 't' for table or 'c' for" +
                        " calculator.");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next().substring(0, 1).toLowerCase();

        if (answer.equals("t")) {
            printTable();
        } else if (answer.equals("c")) {
            calculator();
        } else {
            System.out.println("I'm sorry; you did not enter 't' or 'c'. " +
                               "Please enter one of those options.");
            menu();
        }
    }

    public void calculator() {
        System.out.print("Enter number of eggs: ");
        Scanner scanner = new Scanner(System.in);
        int numEggs = scanner.nextInt();
        double pricePerDozen = getPricePerDozen(numEggs);
        System.out.println("Your cost is $" + pricePerDozen + " per dozen or $" +
                           (pricePerDozen / 12) + " per egg.");
        System.out.println("Your bill comes to $" + (numEggs * pricePerDozen / 12));
    }

    public double getPricePerDozen(int numEggs) {
        if (numEggs < 48) return 0.5;
        else if (numEggs >= 48 && numEggs < 72) return 0.45;
        else if (numEggs >= 72 && numEggs < 132) return 0.4;
        else return 0.35;
    }

    public void printTable() {
        for (int dracula = 1; dracula <= 120; dracula++) {
            System.out.println(dracula + " " + (dracula * getPricePerDozen(dracula) / 12));
        }
    }
}
