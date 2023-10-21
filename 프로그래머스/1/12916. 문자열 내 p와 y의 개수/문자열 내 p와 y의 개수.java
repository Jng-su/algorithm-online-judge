class Solution {
    boolean solution(String s) {
        // 대문자로 변환한 문자열을 생성
        String upperCaseString = s.toUpperCase();
        
        // 'P'와 'Y'의 개수를 세기 위한 변수 초기화
        int pCount = 0;
        int yCount = 0;

        for (int i = 0; i < upperCaseString.length(); i++) {
            char c = upperCaseString.charAt(i);
            if (c == 'P') {
                pCount++;
            } else if (c == 'Y') {
                yCount++;
            }
        }

        return pCount == yCount;
    }
}
