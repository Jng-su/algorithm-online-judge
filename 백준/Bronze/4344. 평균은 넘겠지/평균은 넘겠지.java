import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int people = Integer.parseInt(st.nextToken());

            int sum = 0;
            int[] scores = new int[people];
            for (int j = 0; j < scores.length; j++) {
                scores[j] = Integer.parseInt(st.nextToken());
                sum += scores[j];
            }

            double avg = (double) sum / people;
            int count = 0;

            for (int j = 0; j < scores.length; j++) {
                if (scores[j] > avg) {
                    count++;
                }
            }

            double result = (double) count / people * 100;

            System.out.printf("%.3f%%\n", result);
        }
    }
}
