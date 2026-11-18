package week12;
import java.util.Scanner;
public class ScoreSearch20Modif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [] scores = {78, 65, 90, 55, 88, 72};
        int key;
        boolean found = false;

        System.out.print("Enter key number: ");
        key = sc.nextInt();

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == key) {
                System.out.println("Score " + key + " was found at index: " + i);
                found = true;
                break;
                
            }
        }
        if (!found) {
            System.out.println("score " + key + " Key not found.");
        }
    }
    
}
