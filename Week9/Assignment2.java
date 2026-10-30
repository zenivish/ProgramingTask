package Week9;
import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int type, duration;
        int total = 0;
        
        do {
            System.out.println("\n--- Parking Menu ---");
            System.out.println("1. Car (Rp 3,000 / hour)");
            System.out.println("2. Motorcycle (Rp 2,000 / hour)");
            System.out.println("0. Exit");
            System.out.print("Enter vehicle type (1/2/0): ");
            type = sc.nextInt();
            
            if (type == 0) {
                break;
            }
            
            if (type == 1 || type == 2) {
                System.out.print("Enter parking duration (hours): ");
                duration = sc.nextInt();
                
                if (type == 1) {
                    total += duration * 3000;
                } else {
                    total += duration * 2000;
                }
            } else {
                System.out.println("Invalid choice! Please choose 1, 2, or 0.");
            }
            
        } while (type != 0);
        
        System.out.println("\nTotal overall parking fee: Rp " + total);
        sc.close();
    }
}
