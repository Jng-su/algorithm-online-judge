class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (n >= a) {
            int exchange = n / a;  // 현재 가지고 있는 빈 병을 교환해서 얻을 수 있는 콜라 수
            answer += exchange * b;  // 교환한 콜라를 더해줌
            n = n % a + exchange * b;  // 남은 빈 병 수 계산
        }
        
        return answer;
    }
}
