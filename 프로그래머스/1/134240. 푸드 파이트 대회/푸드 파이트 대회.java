import java.util.*;

class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();
        
        for(int i=1; i<food.length; i++) {
            int num = food[i] / 2;
            for(int j=0; j<num; j++) {
                left.append(i);
            }
        }
        
        String right = left.reverse().toString();
        left.reverse();
        
        return left.toString() + "0" + right;
    }
}