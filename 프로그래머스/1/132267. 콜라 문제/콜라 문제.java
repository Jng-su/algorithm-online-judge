class Solution {
    public int solution(int a, int b, int n) {
        int result = 0;
        
        while (n >= a) {
            int trade = n / a;
            int remain = n % a;
            
            result += trade * b;
            n = trade * b + remain;
        }
        
        return result;
    }
}
