import java.util.Scanner;
import java.text.DecimalFormat;
public class TipCalculator {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.print("Number of people: ");
        int numPeople = scan.nextInt();
        System.out.print("Tip Percentage: ");
        int tipPercent = scan.nextInt();
        double cost = 0;
        double totalCost = 0;
        while (cost != -1) {
            System.out.print("Cost of item: ");
            cost = scan.nextDouble();
            totalCost += cost;
        }
        double tip = totalCost + totalCost*(tipPercent/100.0);
        double totalBill = totalCost + tip;
        System.out.println("Total bill (before tip): $" + String.format("%.2f",totalCost));
        System.out.println("Tip Percentage: " + tipPercent + "%");
        System.out.println("Tip Amount: $" + String.format("%.2f",tip));
        System.out.println("Total bill: $" + String.format("%.2f",totalBill));
        System.out.println("Cost per person (before tip): $" + String.format("%.2f",totalCost/numPeople));
        System.out.println("Tip per person: $" + String.format("%.2f",tip/numPeople));
        System.out.println("Cost per person: $" + String.format("%.2f",totalBill/numPeople));
    }
}
