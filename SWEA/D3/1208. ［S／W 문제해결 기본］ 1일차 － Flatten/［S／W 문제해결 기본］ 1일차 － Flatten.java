import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int t = 1; t <= 10; t++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[100];
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 100; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int result = calculateHeightDifference(arr, N);

            System.out.println("#" + t + " " + result);
        }
    }

    private static int calculateHeightDifference(int[] arr, int N) {
        Arrays.sort(arr); // 높이를 오름차순으로 정렬

        for (int i = 0; i < N; i++) {
            arr[99]--;   // 가장 높은 상자를 하나 빼서
            arr[0]++;    // 가장 낮은 상자에 더해주기
            Arrays.sort(arr); // 다시 정렬
        }

        return arr[99] - arr[0];
    }
}
