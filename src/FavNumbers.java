import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int favInt = 0;
        double favDouble = 0;
        favInt = SafeInput.getInt(in, "Enter your favorite int value");
        favDouble = SafeInput.getDouble(in, "Enter your favorite double value");
        System.out.println("You said your favorite int value is " + favInt + " and your favorite double value is " + favDouble);
    }
}
