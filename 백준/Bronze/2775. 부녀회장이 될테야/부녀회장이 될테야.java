import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int TC=0; TC<T; TC++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int[] arr = new int[n];

            // 0층 초기화
            for (int i=0; i<arr.length; i++) {
                arr[i] = i+1;
            }

            // 1층 부터 k층 까지 인원 수 계산
            for (int floor=1; floor<=k; floor++) {
                for (int room=1; room<n; room++) {
                    arr[room] += arr[room-1];
                }
            }

            System.out.println(arr[n-1]);
        }
    }
}
