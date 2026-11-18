package week12;
import java.util.Scanner;
public class ScoreArray20Modif2 {
    public static void main(String[] args) {
        
        int[] finalScores = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < finalScores.length; i++){
            System.out.print("Enter the score for student #" + (i + 1) + ": ");
            finalScores[i] = input.nextInt();
        }
        int passCount = 0;
        int failCount = 0;

        for (int i = 0; i < finalScores.length; i++){
            String status =  (finalScores[i] > 70) ? "PASS" : "FAIL";
            System.out.println("Student #" + (i + 1) +": " + finalScores[i] + "(" + status + ")" );
            if (finalScores[i] > 70) {
                passCount++;
            } else {
                failCount++;
            }
        }
        System.out.println("Total pass student: " + passCount);
        System.out.println("Total fail student: " + failCount);

        input.close();
    }
}
