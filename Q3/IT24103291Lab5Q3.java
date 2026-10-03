import java.util.Scanner;

public class IT24103291Lab5Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.0;
        final double DISCOUNT_10 = 10.0;
        final double DISCOUNT_20 = 20.0;

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        // Validation 1
        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        // Validation 2
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int days = endDate - startDate;

        double totalAmount = days * ROOM_CHARGE;
        double discountRate = 0;

        if (days >= 3 && days <= 4) {
            discountRate = DISCOUNT_10;
        } else if (days >= 5) {
            discountRate = DISCOUNT_20;
        }

        double discount = totalAmount * discountRate / 100;
        double amountToPay = totalAmount - discount;

        System.out.println("Room Charge Per Day: Rs: " + ROOM_CHARGE + "/=");
        System.out.println("Number of Days Reserved: " + days);
        System.out.println("Total Amount to be Paid: " + amountToPay);
    }
}