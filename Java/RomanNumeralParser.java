import java.util.Scanner;

public class RomanNumeralParser {
    // MMMDCCCLXXXVIII
    // 3888
    public static void main(String[] args) {
        System.out.println("Please enter a number, either " +
            "in roman or arabic numerals.\nThe program will detect " +
            "which you have entered.");
        System.out.println("Please note that this program has a limit of 3888 in " +
            "either number system.\nAnything larger will produce unexpected results");
        System.out.print("Number: ");
        String inputString = new Scanner(System.in).next();
        boolean isInt = false;
        int inputNumber = 0;
        try {
            inputNumber = Integer.parseInt(inputString);
            isInt = true;
        } catch (Exception e) {
            isInt = false;
        }

        if (isInt) {
            String result = "";
            while (inputNumber >= 1000) {
                result += "M";
                inputNumber -= 1000;
            }
            while (inputNumber >= 900) {
                result += "CM";
                inputNumber -= 900;
            }
            while (inputNumber >= 500) {
                result += "D";
                inputNumber -= 500;
            }
            while (inputNumber >= 400) {
                result += "CD";
                inputNumber -= 400;
            }
            while (inputNumber >= 100) {
                result += "C";
                inputNumber -= 100;
            }
            while (inputNumber >= 90) {
                result += "XC";
                inputNumber -= 90;
            }
            while (inputNumber >= 50) {
                result += "L";
                inputNumber -= 50;
            }
            while (inputNumber >= 40) {
                result += "XL";
                inputNumber -= 40;
            }
            while (inputNumber >= 10) {
                result += "X";
                inputNumber -= 10;
            }
            while (inputNumber >= 9) {
                result += "IX";
                inputNumber -= 9;
            }
            while (inputNumber >= 5) {
                result += "V";
                inputNumber -= 5;
            }
            while (inputNumber >= 4) {
                result += "IV";
                inputNumber -= 4;
            }
            while (inputNumber >= 1) {
                result += "I";
                inputNumber -= 1;
            }
            System.out.println("\n" + result);
        } else {
            int result = 0;
            boolean didSubtraction = false;
            for (int dracula = 0; dracula < inputString.length(); dracula++) {
                String letter = inputString.substring(dracula, dracula + 1).toUpperCase();

                boolean needsSubtraction = false;
                if (dracula < inputString.length() - 1) {
                    String pair = inputString.substring(dracula, dracula + 2).toUpperCase();
                    RomanNumeralParser rnp = new RomanNumeralParser();
                    needsSubtraction = rnp.isSubtraction(pair);
                }
                if (needsSubtraction) {
                    if (letter.equals("C"))
                        result -= 100;
                    else if (letter.equals("X"))
                        result -= 10;
                    else if (letter.equals("I"))
                        result -= 1;
                    didSubtraction = true;
                }

                if (! didSubtraction) {
                    if (letter.equals("M"))
                        result += 1000;
                    else if (letter.equals("D"))
                        result += 500;
                    else if (letter.equals("C"))
                        result += 100;
                    else if (letter.equals("L"))
                        result += 50;
                    else if (letter.equals("X"))
                        result += 10;
                    else if (letter.equals("V"))
                        result += 5;
                    else
                        result++;
                }
                didSubtraction = false;
            }
            System.out.println("\n" + result);
        }
    }

    public boolean isSubtraction(String roman) {
        String[] order = {"M", "D", "C", "L", "X", "V", "I"};
        int indexOfFirstLetter = 0, indexOfSecondLetter = 0;
        for (int index = 0; index < order.length; index++) {
            if (order[index].equals(roman.substring(0, 1)))
                indexOfFirstLetter = index;
            if (order[index].equals(roman.substring(1, 2)))
                indexOfSecondLetter = index;
        }
        return indexOfFirstLetter > indexOfSecondLetter;
    }
}
