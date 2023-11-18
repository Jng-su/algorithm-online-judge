import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int t = 1; t <= 10; t++) {
			int n = Integer.parseInt(br.readLine());
			char[][] arr = new char[8][8];
			for (int r = 0; r < arr.length; r++) {
				String line = br.readLine();
				arr[r] = line.toCharArray();
			}

			int count = 0;

			// 가로 회문 검사
			for (int r = 0; r < 8; r++) {
				for (int c = 0; c <= 8 - n; c++) {
					int i;
					for (i = 0; i < n / 2; i++) {
						if (arr[r][c + i] != arr[r][c + n - 1 - i]) {
							break;
						}
					}
					if (i == n / 2) {
						count++;
					}
				}
			}

			// 세로 회문 검사
			for (int c = 0; c < 8; c++) {
				for (int r = 0; r <= 8 - n; r++) {
					int i;
					for (i = 0; i < n / 2; i++) {
						if (arr[r + i][c] != arr[r + n - 1 - i][c]) {
							break;
						}
					}
					if (i == n / 2) {
						count++;
					}
				}
			}

			System.out.println("#" + t + " " + count);
		}
	}
}
