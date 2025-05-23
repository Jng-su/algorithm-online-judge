import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        char[] digits = input.toCharArray();
        Arrays.sort(digits);

        StringBuilder sb = new StringBuilder(new String(digits));
        System.out.println(sb.reverse());
    }
}
