import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);

        int[] baskets = new int[n];
        
        for (int T = 0; T < m; T++) {
            String[] method = br.readLine().split(" ");
            int i = Integer.parseInt(method[0]) - 1;
            int j = Integer.parseInt(method[1]) - 1;
            int k = Integer.parseInt(method[2]);
            
            for (int idx = i; idx <= j; idx++) {
                baskets[idx] = k;
            }
        }
        
        for (int num : baskets) {
            System.out.print(num + " ");
        }
    }
}
