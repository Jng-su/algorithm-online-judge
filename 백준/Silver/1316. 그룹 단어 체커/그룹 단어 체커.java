import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 단어의 개수

        int count = 0; // 그룹 단어 개수를 세는 변수

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (isGroupWord(word)) {
                count++;
            }
        }

        System.out.println(count);
    }

    // 그룹 단어인지 확인하는 함수
    private static boolean isGroupWord(String word) {
        Set<Character> set = new HashSet<>();
        char prev = word.charAt(0);

        for (int i = 1; i < word.length(); i++) {
            char current = word.charAt(i);
            
            // 현재 문자가 이전 문자와 다르고 이미 나온 문자인 경우
            if (current != prev && set.contains(current)) {
                return false;
            }
            
            set.add(prev); // 이전 문자를 집합에 추가
            prev = current; // 현재 문자를 이전 문자로 설정
        }

        return true; // 그룹 단어인 경우
    }
}
