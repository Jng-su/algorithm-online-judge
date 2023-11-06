import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int X = Integer.parseInt(inputs[1]);

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            if(num<X){
                System.out.print(num+" ");
            }
        }
    }
}
