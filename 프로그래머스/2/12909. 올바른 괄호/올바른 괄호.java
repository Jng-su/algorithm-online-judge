class Solution {
    boolean solution(String s) {
        if (s.length() % 2 != 0) return false;
        
        int count = 0;
        
        for (char c : s.toCharArray()) {
            if(c == '(') count++;
            else count--;
            
            if(count < 0) return false;
        }
        
        return count==0;
    }
}