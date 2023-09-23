import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int result = cal(N, K); // 함수 이름을 "cal"로 변경
        System.out.println(result);
    }

    // 이항 계수 계산 함수
    public static int cal(int n, int k) { // 함수 이름을 "cal"로 변경
        if (k == 0 || k == n) {
            return 1;
        } else {
            // 파스칼의 삼각형을 이용한 이항 계수 계산
            int[][] dp = new int[n + 1][n + 1];
            for (int i = 0; i <= n; i++) {
                dp[i][0] = 1;
                dp[i][i] = 1;
            }

            for (int i = 2; i <= n; i++) {
                for (int j = 1; j < i; j++) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }

            return dp[n][k];
        }
    }
}
