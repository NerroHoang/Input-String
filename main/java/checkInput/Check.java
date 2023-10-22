package checkInput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Check {

    private Scanner in = new Scanner(System.in);
    private final String PHONE_VALID = "^[0-9]{10}$";
    private final String EMAIL_VALID = "^[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$";

    public String checkInputString() {
        // Loop until the user inputs a valid value
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Input must not be empty.");
            } else {
                return result;
            }
        }
    }

    public String checkInputPhone() {
        while (true) {
            try {
                int phoneCheck = Integer.parseInt(in.nextLine());
                String resultCheck = String.valueOf(phoneCheck);
                if (!resultCheck.matches(PHONE_VALID)) {
                    System.err.println("Phone number must be 10 digits");
                } else {
                    return resultCheck;
                }
            } catch (NumberFormatException ex) {
                System.out.print("Phone number: ");
                System.err.println("Phone number must be a number");
            }
        }
    }

    public String checkInputDate() {
        while (true) {
            try {
                String dateCheck = checkInputString();
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateCheck);
                return dateCheck;
            } catch (ParseException ex) {
                System.out.print("Date: ");
                System.err.println("Date must be in correct format (dd/MM/yyyy)");
            }
        }
    }

    public String checkInputEmail() {
        while (true) {
            String emailCheck = checkInputString();
            if (!emailCheck.matches(EMAIL_VALID)) {
                System.err.println("Email must be in the correct format");
                System.out.print("Email: ");
            } else {
                return emailCheck;
            }
        }
    }

}
