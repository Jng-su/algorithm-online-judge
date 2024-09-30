import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = br.readLine().toCharArray();
        int count = 0;
        boolean change = true;

        for (int i=1; i<s.length; i++) {
            if (s[i] != s[i-1]) {
                s[i] = s[i-1];
                if (change) {
                    count++;
                    change = false;
                }
            } else {
                change = true;
            }
        }
        System.out.println(count);
    }
}
