import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        br.close();

        int line = 1;
        int sum = 0;

        while (sum + line < X) {
            sum += line;
            line++;
        }

        int numerator, denominator;
        if (line % 2 == 0) {
            numerator = X - sum;
            denominator = line - X + sum + 1;
        } else {
            numerator = line - X + sum + 1;
            denominator = X - sum;
        }

        System.out.println(numerator + "/" + denominator);
    }
}
