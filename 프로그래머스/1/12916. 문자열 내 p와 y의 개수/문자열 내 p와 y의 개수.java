class Solution {
    boolean solution(String s) {
        String sToLowerCase = s.toLowerCase();
        int pCount = 0;
        int yCount = 0;
        for(int i=0; i<s.length(); i++) {
            if(sToLowerCase.charAt(i) == 'p') pCount++;
            if(sToLowerCase.charAt(i) == 'y') yCount++;
        }
        return pCount == yCount ? true : false;
    }
}
