import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t=1; t<=T; t++){
            String[] inputs = br.readLine().split(" ");
            int[] arr = new int[inputs.length];
            int sum = 0;
            
            for(int i=0; i<inputs.length; i++){
            	arr[i] = Integer.parseInt(inputs[i]);
                if(arr[i]%2==1){
                    sum+=arr[i];
                }
            }
            System.out.println("#"+t+" "+sum);
        }
	}
}