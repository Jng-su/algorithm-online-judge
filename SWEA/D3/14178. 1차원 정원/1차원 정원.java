import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			String[] inputs = br.readLine().split(" ");
			int N = Integer.parseInt(inputs[0]);
			int D = Integer.parseInt(inputs[1]);

			int result = (int) Math.ceil(N / (double) (2 * D + 1));
			System.out.println("#" + t + " " + result);
		}
	}

}
