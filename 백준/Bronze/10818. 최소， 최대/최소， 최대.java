import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int min = Integer.MAX_VALUE; // 최솟값을 나타내는 변수를 최댓값으로 초기화
        int max = Integer.MIN_VALUE; // 최댓값을 나타내는 변수를 최소값으로 초기화

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i]; // 현재 값이 최솟값보다 작으면 최솟값을 갱신
            }
            if (arr[i] > max) {
                max = arr[i]; // 현재 값이 최댓값보다 크면 최댓값을 갱신
            }
        }

        System.out.println(min + " " + max);
    }
}