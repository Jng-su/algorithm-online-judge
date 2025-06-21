import java.util.*;

class Solution {
    public int[] solution(long n) {
        String numToString = String.valueOf(n);
        StringBuilder sb = new StringBuilder(numToString);
        String reversed = sb.reverse().toString();
        
        int[] result = new int[reversed.length()];
        for(int i=0; i<reversed.length(); i++) {
            result[i] = reversed.charAt(i) - 48;
        }
        
        return result;
    }
}