import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			String memory = br.readLine();
			int count = 0;
			char currentBit = '0';
			for (int i = 0; i < memory.length(); i++) {
				if (memory.charAt(i) != currentBit) {
					currentBit = memory.charAt(i);
					count++;
				}
			}
			System.out.printf("#%d %d\n", t, count);
		}
	}
}
