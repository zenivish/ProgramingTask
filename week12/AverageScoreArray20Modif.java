package week12;
import java.util.Scanner;
public class AverageScoreArray20Modif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of student: ");
        int n = input.nextInt();
        
        int[] studentScore = new int[n];
        int total = 0;
        double average;
        int passCount = 0;

        for(int i = 0; i < studentScore.length; i++) {
            System.out.print("Enter the score for student #" +(i + 1) + ": ");
            studentScore[i] = input.nextInt();
            total += studentScore[i];
            if (studentScore[i] > 70) {
                passCount++;
            }
        }

        average = (double) total / studentScore.length;
        System.out.println("Total score: " + total);
        System.out.println("Average: " + average);

        int highest = studentScore[0];
        int lowest = studentScore[0];
        for (int i = 1; i < studentScore.length; i++) {
            if (studentScore[i] > highest) highest = studentScore[i];
            if (studentScore[i] < lowest) lowest = studentScore[i];
        }
        String grade = "";
        if (average >= 85) {
            grade = "EXCELENT";
        } else if (average >= 70) {
            grade = "GOOD";
        } else {
            grade = "NEEDS IMPROVEMENT";
        }

        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("Class Grade: " + grade);
        System.out.println("Passed student: " + passCount);
    }
}
