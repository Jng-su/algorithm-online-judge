import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t=1; t<=T; t++) {
			t = Integer.parseInt(br.readLine());	
			int[] score = new int[101];
			
			String[] inputs = br.readLine().split(" ");
			for(int i=0; i<1000; i++) {
				int num = Integer.parseInt(inputs[i]);
				score[num]++;
			}
			
			int max = 0, idx = 0;
			for(int i=score.length-1; i>0; i--) {
				if(score[i]>max) {
					max = score[i];
					idx=i;
				}
			}
			System.out.println("#"+t+" "+idx);
		}
	}

}
