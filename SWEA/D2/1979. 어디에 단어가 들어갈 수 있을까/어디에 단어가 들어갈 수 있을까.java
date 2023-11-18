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
			int K = Integer.parseInt(inputs[1]); // 단어의 길이 2<=K<=N

			int[][] arr = new int[N][N];
			// 배열 입력받기
			for (int r = 0; r < arr.length; r++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int c = 0; c < arr[0].length; c++) {
					arr[r][c] = Integer.parseInt(st.nextToken());
				}
			}

			int count = 0;
			count += row(arr, K);
			count += column(arr, K);
			System.out.println("#" + t + " " + count);
		}
	}

	// 가로 비교 : 열 고정 즉, r < arr[0].length;
	private static int row(int[][] arr, int K) {
		int count = 0;
		for (int r = 0; r < arr.length; r++) {
			int tmp = 0;
			for (int c = 0; c < arr[0].length; c++) {
				if (arr[r][c] == 1)
					tmp++;
				else if (tmp >= 1 && arr[r][c] == 0) {
					if (tmp == K)
						count++;
					tmp = 0;
				}
			}
			if (tmp == K)
				count++;
		}
		return count;
	}

	// 세로 비교 : 행 고정 즉, c < arr.length;
	private static int column(int[][] arr, int K) {
		int count = 0;
		for (int c = 0; c < arr[0].length; c++) {
			int tmp = 0;
			for (int r = 0; r < arr.length; r++) {
				if (arr[r][c] == 1)
					tmp++;
				else if (tmp >= 1 && arr[r][c] == 0) {
					if (tmp == K)
						count++;
					tmp = 0;
				}
			}
			if (tmp == K)
				count++;
		}
		return count;
	}

}
