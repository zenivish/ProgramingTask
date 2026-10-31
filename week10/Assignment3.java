package week10;
import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of stores: ");
        int numStores = sc.nextInt();

        if (numStores < 1) {
            System.out.println(
                "The number of stores must be at least 1."
            );
        } else {
            int totalItemsAllStores = 0;
            int storeNo = 1;

            int bestStore = 1;
            int highestItems = -1;

            while (storeNo <= numStores) {
                System.out.println("Store " + storeNo);

                System.out.print(
                    "Enter the number of customers: "
                );
                int numCustomers = sc.nextInt();

                if (numCustomers < 0) {
                    System.out.println(
                        "Number of customers cannot be negative."
                    );
                } else {
                    int totalItemsStore = 0;

                    for (int i = 1; i <= numCustomers; i++) {
                        System.out.print(
                            "Enter items bought by customer "
                            + i + ": "
                        );

                        int items = sc.nextInt();

                        if (items < 0) {
                            System.out.println(
                                "Items cannot be negative."
                            );

                            i--;
                        } else {
                            totalItemsStore += items;
                        }
                    }

                    System.out.println(
                        "Store " + storeNo
                        + " - customers: " + numCustomers
                        + ", total items: " + totalItemsStore
                    );

                    totalItemsAllStores += totalItemsStore;

                    if (totalItemsStore > highestItems) {
                        highestItems = totalItemsStore;
                        bestStore = storeNo;
                    }
                }

                storeNo++;
            }

            System.out.println(
                "Total items across all stores: "
                + totalItemsAllStores
            );

            System.out.println(
                "Store with the most items: "
                + bestStore
            );
        }

        sc.close();
    }
}