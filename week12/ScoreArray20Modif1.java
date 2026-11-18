package week12;
import java.util.Scanner;
public class ScoreArray20Modif1 {
    public static void main(String[] args) {
        
        int[] finalScores = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < finalScores.length; i++){
            System.out.print("Enter the score for student #" + (i + 1) + ": ");
            finalScores[i] = input.nextInt();
        }
        for (int i = 0; i < finalScores.length; i++){
            if (finalScores[i] > 70) {
            System.out.println("Student #" + (i + 1) +": " + finalScores[i] + "(PASS)" );   
            }
        }
        input.close();
    }
}
