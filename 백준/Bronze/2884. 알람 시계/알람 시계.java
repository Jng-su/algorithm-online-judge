import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int hour = Integer.parseInt(inputs[0]);
        int min = Integer.parseInt(inputs[1]);
        br.close();

        if (min < 45) {
            hour--;
            min = 60 - (45 - min);
            if (hour < 0) {
                hour = 23;
            }
        } else {
            min -= 45;
        }

        System.out.println(hour + " " + min);
    }
}