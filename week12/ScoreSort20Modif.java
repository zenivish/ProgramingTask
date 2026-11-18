package week12;
import java.util.Arrays;
public class ScoreSort20Modif {
    public static void main(String[] args) {
        int[] scores = {78, 65, 90, 55, 88, 72};
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = 0; j < scores.length - 1; j++) {
                if (scores[j] < scores[j + 1]) {
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(scores));
    }
}
