package week9;
import java.util.Scanner;
public class SiakadForAttendance20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        Double score, highest = 0.0, lowest = 100.0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter score for student " + i + ": ");
            score = sc.nextDouble();

            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
        }

        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);

        sc.close();
    }    
}
