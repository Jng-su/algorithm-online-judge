import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String board = br.readLine();

        String result = coverWithPolyomino(board);
        System.out.println(result);
    }

    static String coverWithPolyomino(String board) {
        StringBuilder result = new StringBuilder(board);
        for (int i = 0; i < board.length(); i++) {
            if (board.charAt(i) == 'X') {
                if (i + 3 < board.length() && board.charAt(i + 1) == 'X' && board.charAt(i + 2) == 'X' && board.charAt(i + 3) == 'X') {
                    result.setCharAt(i, 'A');
                    result.setCharAt(i + 1, 'A');
                    result.setCharAt(i + 2, 'A');
                    result.setCharAt(i + 3, 'A');
                    i += 3;
                } else if (i + 1 < board.length() && board.charAt(i + 1) == 'X') {
                    result.setCharAt(i, 'B');
                    result.setCharAt(i + 1, 'B');
                    i += 1;
                } else {
                    return "-1"; // 덮을 수 없는 경우
                }
            }
        }

        return result.toString();
    }
}
