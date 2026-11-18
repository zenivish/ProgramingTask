package week12;
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of student scores to input: ");
        int numberOfStudents = input.nextInt();
        if (numberOfStudents <= 0) {
            System.out.println("The number of students must be greater than 0.");
            input.close();
            return;
        }

        int[] studentScore = new int[numberOfStudents];
        int total = 0;

        for(int i = 0; i < studentScore.length; i++) {
            System.out.print("Enter the score for student #" +(i + 1) + ": ");
            studentScore[i] = input.nextInt();
            total += studentScore[i];
        }

        int highest = studentScore[0];
        int lowest = studentScore[0];
        for (int i = 1; i < studentScore.length; i++) {
            if (studentScore[i] > highest) highest = studentScore[i];
            if (studentScore[i] < lowest) lowest = studentScore[i];
        }

        double average = (double) total / studentScore.length;
        System.out.println("Average: " + average);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("Scores and status:");

        for (int i = 0; i < studentScore.length; i++) {
            String status = studentScore[i] > 70 ? "PASS" : "FAIL";
            System.out.println("Student #" + (i + 1) + ": " + studentScore[i] + " (" + status + ")");
        }
        
        input.close();
    }
}
