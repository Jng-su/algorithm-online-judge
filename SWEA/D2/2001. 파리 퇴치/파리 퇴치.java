import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			String[] inputs = br.readLine().split(" ");
			int N = Integer.parseInt(inputs[0]); // 배열의 크기 5<=N<=15
			int M = Integer.parseInt(inputs[1]); // 파리채의 크기 2<=M<=N

			int[][] arr = new int[N][N];

			// 배열 입력 받기
			for (int r = 0; r < N; r++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int c = 0; c < N; c++) {
					arr[r][c] = Integer.parseInt(st.nextToken());
				}
			}

			int maxSum = 0; // 파리 퇴치 최대 갯수

			for (int r = 0; r <= N - M; r++) {
				for (int c = 0; c <= N - M; c++) {
					int sum = 0;
					// 파리채 크기만큼 더하고 maxSum 이랑 비교하기
					for (int i = r; i < r + M; i++) {
						for (int j = c; j < c + M; j++) {
							sum += arr[i][j];
						}
					}
					maxSum = Math.max(sum, maxSum);
				}
			}

			System.out.println("#" + t + " " + maxSum);
		}
	}
}
