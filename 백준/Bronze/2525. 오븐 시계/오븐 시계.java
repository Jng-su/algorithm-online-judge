import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int Hour = Integer.parseInt(inputs[0]);
        int Minute = Integer.parseInt(inputs[1]);
        int Cook = Integer.parseInt(br.readLine());

        Minute += Cook;

        while (Minute >= 60) {
            Minute -= 60;
            Hour += 1;

            if (Hour == 24) {
                Hour = 0;
            }
        }

        System.out.println(Hour + " " + Minute);
    }
}
