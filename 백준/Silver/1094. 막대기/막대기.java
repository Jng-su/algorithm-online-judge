import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        int currentLength = 64;
        int count = 0; 

        while (X > 0) {
            if (currentLength > X) {
                currentLength /= 2;
            } else {
                X -= currentLength;
                count++;
            }
        }

        System.out.println(count);
    }
}
