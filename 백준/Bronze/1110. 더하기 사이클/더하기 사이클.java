import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int originNum = Integer.parseInt(br.readLine());
        int temp = originNum;
        int count = 0;

        while (true) {
            int tens = temp / 10;
            int ones = temp % 10;
            int sumDigits = (tens + ones) % 10;

            temp = (ones * 10) + sumDigits;
            count++;

            if (originNum == temp) break;

        }
        System.out.println(count);
    }
}