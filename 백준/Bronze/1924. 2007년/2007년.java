import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");

        int Month = Integer.parseInt(inputs[0]);
        int Day = Integer.parseInt(inputs[1]);

        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totalDays = Day;
        for (int i = 0; i < Month - 1; i++) {
            totalDays += monthDays[i];
        }

        String result = days[(totalDays - 1) % 7];
        System.out.println(result);
    }
}
