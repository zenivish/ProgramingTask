package week6;

import java.util.Scanner;

public class Task1Jobsheet6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type;
        int quantity;
        double totalAmount;
        double discount = 0;
        double discountAmount;
        double amountToPay;

        System.out.print("Enter book type (dictionary/novel/other): ");
        type = sc.nextLine().trim().toLowerCase();

        System.out.print("Enter number of books: ");
        quantity = sc.nextInt();

        System.out.print("Enter total amount: ");
        totalAmount = sc.nextDouble();

        // Nested IF
        if (type.equals("dictionary")) {
            discount = 10;

            if (quantity > 2) {
                discount = discount + 2;
            }

        } else {
            if (type.equals("novel")) {
                discount = 7;

                if (quantity > 3) {
                    discount = discount + 2;
                } else {
                    discount = discount + 1;
                }

            } else {
                if (quantity > 3) {
                    discount = 5;
                }
            }
        }

        discountAmount = totalAmount * discount / 100;
        amountToPay = totalAmount - discountAmount;

        System.out.println("\n===== BOOKSTORE DISCOUNT =====");
        System.out.println("Book type       : " + type);
        System.out.println("Number of books : " + quantity);
        System.out.println("Total amount    : " + totalAmount);
        System.out.println("Discount        : " + discount + "%");
        System.out.println("Discount amount : " + discountAmount);
        System.out.println("Amount to pay   : " + amountToPay);

        sc.close();
    }
}