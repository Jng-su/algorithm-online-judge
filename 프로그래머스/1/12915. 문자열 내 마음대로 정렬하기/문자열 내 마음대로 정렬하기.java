import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                char c1 = s1.charAt(n);
                char c2 = s2.charAt(n);

                if (c1 == c2) {
                    // 만약 인덱스 n의 문자가 같다면, 문자열 전체를 비교하여 사전순 정렬
                    return s1.compareTo(s2);
                } else {
                    // 인덱스 n의 문자를 기준으로 오름차순 정렬
                    return Character.compare(c1, c2);
                }
            }
        });

        return strings;
    }
}
