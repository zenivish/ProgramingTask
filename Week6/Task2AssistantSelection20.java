package week6;
import java.util.Scanner;
public class Task2AssistantSelection20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean activeStudent;
        boolean underSanction;
        double basicProgrammingGrade;
        boolean hasCertificate;
        double interviewScore;

        System.out.print("Is the student active? (true/false): ");
        activeStudent = sc.nextBoolean();

        System.out.print("Is the student under academic sanction? (true/false): ");
        underSanction = sc.nextBoolean();

        if (activeStudent && !underSanction) {

            System.out.print("Enter Basic Programming grade: ");
            basicProgrammingGrade = sc.nextDouble();

            System.out.print("Does the student have a programming competency certificate? (true/false): ");
            hasCertificate = sc.nextBoolean();

            if (basicProgrammingGrade >= 80 || hasCertificate) {

                System.out.println("Selection requirements met.");
                System.out.println("The student is called for an interview.");

                System.out.print("Enter interview score: ");
                interviewScore = sc.nextDouble();

                if (interviewScore >= 75) {
                    System.out.println("Accepted as a lab assistant.");
                } else {
                    System.out.println("Not accepted as a lab assistant.");
                    System.out.println("Reason: Interview score is below 75.");
                }

            } else {
                System.out.println("Not eligible for the interview.");
                System.out.println(
                    "Reason: Basic Programming grade is below 80 "
                    + "and the student does not have a programming competency certificate."
                );
            }

        } else {
            System.out.println("Not eligible for the selection.");

            if (!activeStudent && underSanction) {
                System.out.println(
                    "Reason: Student status is inactive "
                    + "and the student is under academic sanction."
                );
            } else if (!activeStudent) {
                System.out.println("Reason: Student status is inactive.");
            } else {
                System.out.println("Reason: Student is under academic sanction.");
            }
        }

        sc.close();
    }
}
    
