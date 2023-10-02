import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int[] positions = new int[26];

        for (int i = 0; i < 26; i++) {
            positions[i] = -1;
        }

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if (positions[index] == -1) {
                positions[index] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(positions[i] + " ");
        }
        br.close();
    }
}
