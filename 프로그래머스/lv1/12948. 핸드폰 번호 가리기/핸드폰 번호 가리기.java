class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length();
        StringBuilder answer = new StringBuilder();
        
        // 뒷 4자리를 제외한 나머지 숫자를 '*'로 대체합니다.
        for (int i = 0; i < length - 4; i++) {
            answer.append('*');
        }
        
        // 나머지 뒷 4자리를 그대로 추가합니다.
        answer.append(phone_number.substring(length - 4));
        
        return answer.toString();
    }
}
