package week13;
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] surveyData = new int[10][6];
        double totalSurvey = 0;

        for (int i = 0; i < surveyData.length; i++) {
            System.out.println("Enter data for respondent. " + (i + 1));
            
            for (int j = 0; j < surveyData[i].length; j++) {
                do {
                    System.out.print("Enter the answer for question " + (j + 1) + ("(1-5): "));
                    surveyData[i][j] = sc.nextInt();

                    if (surveyData[i][j] < 1 || surveyData[i][j] > 5) {
                        System.out.println("invalid input! please enter 1-5.");
                    } 
                } while (surveyData[i][j] < 1 || surveyData[i][j] > 5);

                totalSurvey += surveyData[i][j];
            }
        }

        System.out.println("\n=== AVERAGE SCORE PER RESPONDENT ===");

        for (int i = 0; i < surveyData.length; i++) {
            int sum = 0;

            for (int j = 0; j < surveyData[i].length; j++) {
                sum += surveyData[i][j];
            }

            double average = (double) sum / 6;
            System.out.println("Respondent: " + (i + 1) + average);
        }

        System.out.println("\n=== AVERAGE SCORE PER QUESTION ===");

        for (int j = 0; j < 6; j++) {
            int sum = 0;

            for (int i = 0; i < surveyData.length; i++) {
                sum += surveyData[i][j];
            }

            double average = (double) sum / 10;
            System.out.println("Question: " + (j + 1) + average);
        }

        double overallAverage = (double) totalSurvey / 60;

        System.out.println("\n=== OVERALL AVERAGE SCORE ===");
        System.out.print("Overall Average: %.2f%n" + overallAverage);

        sc.close();
    }
}

