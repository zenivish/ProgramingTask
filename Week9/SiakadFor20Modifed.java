package Week9;
import java.util.Scanner;
public class SiakadFor20Modifed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double score, highest = 0.0, lowest = 100.0;
        int passCount = 0;
        int failCount = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter score for student " + i + ": ");
            score = sc.nextDouble();
            
            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
            
            if (score >= 60) {
                passCount++;
            } else {
                failCount++;
            }
        }
        
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("Number of students who pass: " + passCount);
        System.out.println("Number of students who fail: " + failCount);
        
        sc.close();
    }
}