import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t=1; t<=T; t++) {
			
			String[] inputs = br.readLine().split(" ");
			int[] arr = new int[10];
			for(int i=0; i<10; i++) {
				arr[i] = Integer.parseInt(inputs[i]);
			}
			
			Arrays.sort(arr);
			
			double sum = 0;
			for(int i=1; i<9; i++) {
				sum += arr[i];
			}
			
			
			
			int result = (int)Math.round(sum/8);
			
			System.out.println("#"+t+" "+result);
		}
	}

}
