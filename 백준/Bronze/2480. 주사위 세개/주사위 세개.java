import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int c = Integer.parseInt(inputs[2]);

        int result = calculate(a, b, c);
        System.out.println(result);
    }

    public static int calculate(int a, int b, int c) {
        if (a != b && b != c && a != c) {
            int max = Math.max(a, Math.max(b, c));
            return max * 100;
        } else if (a == b && a == c) {
            return 10000 + a * 1000;
        } else if (a == b || a == c) {
            return 1000 + a * 100;
        } else {
            return 1000 + b * 100;
        }
    }
}