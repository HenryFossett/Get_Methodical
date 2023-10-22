import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double totalCost = 0;
        boolean moreItems = false;
        boolean done = false;
        itemPrice = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00);
        do {
            moreItems = SafeInput.getYNConfirm(in, "Do want to get another item");
            if(moreItems == true){
                totalCost = totalCost + itemPrice;
                itemPrice = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00);
            } else {
                totalCost = totalCost + itemPrice;
                done = true;
            }
        } while(!done);
        System.out.println("Your total cost is " + totalCost);
    }
}
