import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        if (N == 1) {
            System.out.println(1);
        } else {
            int count = 2;
            int lastRange = 7;
            while (true) {
                if (N <= lastRange) {
                    System.out.println(count);
                    break;
                }
                lastRange += 6 * count;
                count++;
            }
        }
    }
}
