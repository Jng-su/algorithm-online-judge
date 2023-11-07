import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=1; t<=T; t++){
			StringTokenizer st = new StringTokenizer(br.readLine());
            int max = 0;
            
            while(st.hasMoreTokens()){
            	int num = Integer.parseInt(st.nextToken());
                if(num>max) max = num;
            }
            
			System.out.println("#"+ t +" "+ max);
        }
	}
}