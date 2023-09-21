import java.util.Scanner;
public class DoNow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an ODD integer: ");
        int number = scan.nextInt();

        while (number % 2 == 0) {
            System.out.print("No silly, i said ODD not even! Try again: ");
            number = scan.nextInt();
        }

        System.out.print("Done!");
    }
}
