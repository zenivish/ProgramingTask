package week13;
import java.util.Scanner;
public class CinemaWithScanner20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;
        String name, choice;
        String[][] audience = new String[4][2];

        while (true) {
            System.out.print("Enter name: ");
            name = sc.nextLine();
            System.out.print("Enter row: ");
            row = sc.nextInt();
            System.out.print("Enter coloumn: ");
            col = sc.nextInt();
            sc.nextLine();

            audience[row -1][col - 1] = name;

            System.out.print("Add another audience member? (y/n): ");
            choice = sc.nextLine();

            if (choice.equalsIgnoreCase("n")) {
                break;
            }   
        }
    }
}
