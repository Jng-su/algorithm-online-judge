import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int t = 1; t <= 10; t++) {
			int count = 0;
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];
			// 건물들 배열로 입력 받기
			// test 입력 => 0 0 3 5 2 4 9 0 6 4 0 6 0 0 (14개)
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			// 처음,끝 인덱스 값 두 개는 0으로 고정 -> 2 ~ arr.length - 2 까지
			for (int i = 2; i < arr.length - 2; i++) {
				int leftmax = Math.max(arr[i - 2], arr[i - 1]);
				int rightmax = Math.max(arr[i + 1], arr[i + 2]);

				if (arr[i] > leftmax && arr[i] > rightmax) {
					int cnt = Math.min(arr[i] - leftmax, arr[i] - rightmax);
					count += cnt;
				}
			}
			System.out.println("#" + t + " " + count);
		}
	}
}
