import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");

        long A = Integer.parseInt(inputs[0]);
        long B = Integer.parseInt(inputs[1]);
        long V = Integer.parseInt(inputs[2]);

        long goalDist = V - B;  // 최종 높이
        long dayDist = A - B;   // 하루동안 올라갈 수 있는 높이

        long days = goalDist / dayDist;
        if (goalDist%dayDist > 0) {
            System.out.println(days+1);
        } else {
            System.out.println(days);
        }
    }
}
