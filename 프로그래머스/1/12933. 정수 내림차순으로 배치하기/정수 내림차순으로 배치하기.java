import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String numStr = Long.toString(n);
        char[] charArray = numStr.toCharArray();
        Arrays.sort(charArray);
        char[] reversedArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            reversedArray[i] = charArray[charArray.length - 1 - i];
        }
        String resultStr = new String(reversedArray);
        long answer = Long.parseLong(resultStr);

        return answer;
    }
}
