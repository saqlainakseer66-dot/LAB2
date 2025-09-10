import java.util.Scanner;
public class Pizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basePrice = 0;
        // Ask size
        while (true) {
            System.out.print("Enter pizza size (small/medium/large): ");
            String size = sc.nextLine().toLowerCase();

            if (size.equals("small")) {
                basePrice = 100;
                break;
            } else if (size.equals("medium")) {
                basePrice = 200;
                break;
            } else if (size.equals("large")) {
                basePrice = 300;
                break;
            } else {
                System.out.println("Invalid! Try again.");
                continue;
            }
        }
        // Pepperoni option
        System.out.print("Do you want pepperoni? (yes/no): ");
        String pepperoni = sc.nextLine().toLowerCase();
        if (pepperoni.equals("yes")) {
            if (basePrice == 100) { // small
                basePrice += 30;
            } else { // medium or large
                basePrice += 50;
            }
        }
        // Cheese
        System.out.print("Do you want extra cheese? (yes/no): ");
        String cheese = sc.nextLine().toLowerCase();
        if (cheese.equals("yes")) {
            basePrice += 20;
        }
        //  bill
        System.out.println("Your final bill is: " + basePrice + " rupees");

        sc.close();
    }
}
