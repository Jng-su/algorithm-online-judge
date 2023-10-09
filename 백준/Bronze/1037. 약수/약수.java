import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N의 진짜 약수 개수 입력
        int n = Integer.parseInt(br.readLine());

        // N의 진짜 약수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] divisors = new int[n];

        for (int i = 0; i < n; i++) {
            divisors[i] = Integer.parseInt(st.nextToken());
        }

        // N을 구하기 위해 진짜 약수 중 최댓값과 최솟값을 곱하면 됨
        int minDivisor = divisors[0];
        int maxDivisor = divisors[0];

        for (int i = 1; i < n; i++) {
            minDivisor = Math.min(minDivisor, divisors[i]);
            maxDivisor = Math.max(maxDivisor, divisors[i]);
        }

        long result = (long) minDivisor * maxDivisor; // N은 32비트 부호있는 정수로 표현할 수 있으므로 long으로 형변환

        System.out.println(result);
    }
}
