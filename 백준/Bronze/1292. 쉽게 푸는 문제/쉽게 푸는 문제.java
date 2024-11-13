import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        int startIdx = Integer.parseInt(inputs[0]);
        int endIdx = Integer.parseInt(inputs[1]);

        // 수열 배열 만들기
        int[] board = new int[1001];

        int idx = 1;
        for (int i = 1; idx < 1001; i++) {
            for (int j = 1; j <= i && idx < 1001; j++) {
                board[idx++] = i;
            }
        }

        // 합 배열 만들기
        int[] sum = new int[1001];
        for (int i = 1; i < 1001; i++) {
            sum[i] = sum[i - 1] + board[i];
        }

        System.out.println(sum[endIdx] - sum[startIdx - 1]);
    }
}
