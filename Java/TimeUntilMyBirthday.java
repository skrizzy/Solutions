import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TimeUntilMyBirthday {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        today.setTime(new Date());

        Calendar birthday = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt() - 1;
        int date = scanner.nextInt() - 1;
        birthday.set(0, month, date);

        int days = birthday.get(Calendar.DAY_OF_YEAR) - today.get(Calendar.DAY_OF_YEAR);
        System.out.println("There are " + days + " days until your birthday.");
    }
}
