import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i=1; i<=T; i++){
            String[] inputs = br.readLine().split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            System.out.println("Case #"+i+": "+(a+b));
        }
    }
}
