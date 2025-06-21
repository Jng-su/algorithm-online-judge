import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] strArray = new String[numbers.length];
        for(int i=0; i<numbers.length; i++) {
            strArray[i] = String.valueOf(numbers[i]);   
        }
        
        Arrays.sort(strArray, (a,b)->(b+a).compareTo(a+b));
        
        if(strArray[0].equals("0")) return "0";
        
        StringBuilder sb = new StringBuilder();
        for(String s : strArray) {
            sb.append(s);
        }
        
        return sb.toString();
    }
}