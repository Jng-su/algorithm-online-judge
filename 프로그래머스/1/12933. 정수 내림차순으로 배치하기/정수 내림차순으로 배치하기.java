import java.util.*;

class Solution {
    public long solution(long n) {
        String str = String.valueOf(n);
        int[] digits = new int[str.length()];
        
        for(int i=0; i<str.length(); i++) {
            digits[i] = -(str.charAt(i) - '0');
        }
        Arrays.sort(digits);
        
        StringBuilder sb = new StringBuilder();
        for(int digit : digits) sb.append(-digit);
        
        return Long.parseLong(sb.toString());
    }
}
