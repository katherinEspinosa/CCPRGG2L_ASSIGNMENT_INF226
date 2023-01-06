import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter NU student email address: ");
        String studentMail = scan.nextLine();

        // Long method
        Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentMail);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid student email");
        } else {
            System.out.println("invalid student email");
        }

        // Short method
        System.out.print("Enter Your Philippine Phone Number: ");
        String philPhoneNum = scan.nextLine();
        match = Pattern.compile("\\+63\\d{10}").matcher(philPhoneNum).matches();

        if (match) {
            System.out.println("valid Philippine Phone Number");
        } else {
            System.out.println("invalid Philippine Phone Number");
        }

        // Even shorter method
        System.out.print("Enter Your Birthdate (Format: YYYY-MM-DD): ");
        String birthDate = scan.nextLine();
        match = Pattern.matches("\\d{4}-\\d{2}-\\d{2}", birthDate);

        if (match) {
            System.out.println("valid birthdate format");
        } else {
            System.out.println("invalid birthdate format");
        }

        System.out.println("Submitted by: Katherine Maegan G. Espinosa");
    }
}
