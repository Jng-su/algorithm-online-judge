import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase(); // 입력 문자열을 대문자로 변환

        int totalTime = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int dialNumber = getDialNumber(ch); // 다이얼 번호를 가져옴
            totalTime += dialNumber + 1; // 걸리는 시간을 더함
        }

        System.out.println(totalTime);
    }

    // 문자에 대응하는 다이얼 번호를 반환하는 함수
    private static int getDialNumber(char ch) {
        if (ch >= 'A' && ch <= 'C') return 2;
        else if (ch >= 'D' && ch <= 'F') return 3;
        else if (ch >= 'G' && ch <= 'I') return 4;
        else if (ch >= 'J' && ch <= 'L') return 5;
        else if (ch >= 'M' && ch <= 'O') return 6;
        else if (ch >= 'P' && ch <= 'S') return 7;
        else if (ch >= 'T' && ch <= 'V') return 8;
        else if (ch >= 'W' && ch <= 'Z') return 9;
        else return 0; // 예외 처리
    }
}
