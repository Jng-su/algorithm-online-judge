import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        double[] score = new double[N];
        for (int i = 0; i < N; i++) {
            score[i] = Double.parseDouble(inputs[i]);
        }

        double NewAverage = NewAverage(score);
        System.out.println(NewAverage);

    }

    public static double findMax(double[] score) {
        double max = score[0];
        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
        }
        return max;
    }

    public static double NewAverage(double[] score) {
        double max = findMax(score);
        double total = 0;

        for (double num : score) {
            total += (num / max) * 100;
        }

        return total / N;
    }
}
