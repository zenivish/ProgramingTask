package week6;
import java.util.Scanner;
public class LogicalOperatorWifi20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isStudent;
        boolean isLecturer;
        boolean isBlocked;

        System.out.print("Is the user student (true/false):");
        isStudent = sc.nextBoolean();

        System.out.print("Is the user Lecturer (true/false):");
        isLecturer = sc.nextBoolean();

        System.out.print("Is the user recently bloked (true/false):");
        isBlocked = sc.nextBoolean();

        if ((isStudent || isLecturer) && !isBlocked) {
            System.out.println("WiFi access granted");
        } else {
            System.out.println("WiFi access denied");
            }

        sc.close();
    }

}
