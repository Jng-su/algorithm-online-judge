import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i=0; i<n; i++) {
            String[] inputs = br.readLine().split(" ");
            int mon = Integer.parseInt(inputs[0]);
            int count = Integer.parseInt(inputs[1]);
            sum += mon * count;
        }
        if(total==sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
