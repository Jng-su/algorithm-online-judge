import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toLowerCase(); // 입력 문자열을 모두 소문자로 변환하여 대소문자를 구분하지 않음
        int[] alphabetCount = new int[26]; // 알파벳 빈도를 저장하기 위한 배열

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isAlphabetic(ch)) { // 알파벳인 경우만 처리
                alphabetCount[ch - 'a']++; // 알파벳 빈도 증가
            }
        }

        int maxCount = 0;
        char mostFrequent = '?';

        for (int i = 0; i < 26; i++) {
            if (alphabetCount[i] > maxCount) {
                maxCount = alphabetCount[i];
                mostFrequent = (char) ('A' + i);
            } else if (alphabetCount[i] == maxCount) {
                mostFrequent = '?'; // 가장 많이 나온 알파벳이 여러 개인 경우 '?'로 설정
            }
        }

        System.out.println(mostFrequent);
    }
}
