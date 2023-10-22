import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ssnRegEx = "^\\d{3}-\\d{2}-\\d{4}$";
        String UCIdRegEx = "^(M|m)\\d{5}$";
        String menuChoiceRegEx ="^[OoSsVvQq]$";

        String ssn = "";
        String UCId = "";
        String menuChoice = "";

        ssn = SafeInput.getRegExString(in, "Enter your SSN", ssnRegEx);
        UCId = SafeInput.getRegExString(in, "Enter your UC Student M Number", UCIdRegEx);
        menuChoice = SafeInput.getRegExString(in, "Enter a menu choice", menuChoiceRegEx);
        System.out.println("You said your SSN is " + ssn + ", your UC Student M number is " + UCId + ", and your menu choice is " + menuChoice +".");
    }
}
