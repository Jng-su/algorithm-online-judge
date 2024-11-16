import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;

        HashSet<String> entered = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String input = br.readLine();

            if (input.equals("ENTER")) {
                entered.clear();
            } else if (!entered.contains(input)) {
                entered.add(input);
                result++;
            }
        }

        System.out.println(result);
    }
}
