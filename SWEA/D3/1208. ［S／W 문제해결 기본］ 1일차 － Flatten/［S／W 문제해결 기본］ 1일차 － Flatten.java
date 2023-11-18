import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int t=1; t<=10; t++) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[100];
			// 입력 N = 2 , 5 8 3 1 5 6 9 9 2 2 4 출력 = 6
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			int result = heightdiff(arr,N);
			System.out.println("#" + t + " " + result);
			
		}
	}
	private static int heightdiff(int[] arr, int N) {
		Arrays.sort(arr);
		
		for(int i=0; i<N; i++) {
			arr[99]--;
			arr[0]++;
			Arrays.sort(arr);
		}
		
		return arr[99] - arr[0];
	}

}
