import java.util.Random;
import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        //INPUT
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("Number of people: ");
        int numPeople = scan.nextInt();
        System.out.print("Tip Percentage: ");
        int tipPercent = scan.nextInt();
        double cost = 0;
        double totalCost = 0;
        while (cost != -1) {
            System.out.print("Cost of item (-1 to end): $");
            cost = scan.nextDouble();
            if (cost != -1) {
                totalCost += cost;
            }
        }
        System.out.println("------------------------");
        //OUTPUT
        double tip = totalCost*(tipPercent/100.0);
        double totalBill = totalCost + tip;
        System.out.println("Total bill (before tip): $" + String.format("%.2f",totalCost));
        System.out.println("Tip Percentage: " + tipPercent + "%");
        System.out.println("Tip Amount: $" + String.format("%.2f",tip));
        System.out.println("Total Bill: $" + String.format("%.2f",totalBill));
        System.out.println("Cost Per Person (before tip): $" + String.format("%.2f",totalCost/numPeople));
        System.out.println("Tip Per Person: $" + String.format("%.2f",tip/numPeople));
        System.out.println("Cost Per Person: $" + String.format("%.2f",totalBill/numPeople));
        //FREESTYLE (CARD)
        Random random = new Random();
        double balance = random.nextDouble(400);
        System.out.println("------------------------");
        if (totalBill > balance) {
            System.out.println("CARD ACCEPTED");
            System.out.println("$" + String.format("%.2f",(totalBill - balance)) + " remaining");
        } else {
            System.out.println("CARD DECLINED");
            System.out.println("$" + String.format("%.2f",(balance - totalBill)) + " required");
        }
    }
}