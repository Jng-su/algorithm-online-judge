import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 'a' = 97 'z' = 122 총 26의 크기
        // 'h' 가 들어오면 (int)('h'-'a') 해주면 됨
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;                                  // 그룹단어 카운트
        for(int i=0; i<N; i++) {
            char[] str = br.readLine().toCharArray();   // 문자열 입력
            boolean[] check = new boolean[26];          // 그룹단어 확인 , true 면 연속된 단어
            boolean isGroup = true;                     // 그룹 여부 입력된 단어가 그룹이 아니면 break

            char prevChar = str[0];                       // 전에 값을 기록 (갱신해야함), 현재값과 이전값이 다르고 이전에 등장했던 (check가 true)일 경우 그룹단어가 아니다.
            check[(int)(prevChar-'a')] = true;

            for(int j=0; j<str.length; j++) {
                char current = str[j];

                // 그룹단어가 아니다
                if(prevChar!=current && check[(int)(current-'a')]) {
                    isGroup = false;
                    break;
                }

                check[(int)(current-'a')] = true;
                prevChar = current;
            }

            if(isGroup) count++;
        }
        System.out.println(count);
    }
}
