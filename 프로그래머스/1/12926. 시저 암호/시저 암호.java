class Solution {
    public String solution(String s, int n) {
        StringBuilder result = new StringBuilder();
        
        for(char current : s.toCharArray()) {
            if(current == ' ') result.append(" ");
            else if (Character.isLowerCase(current)) {
                char encoded = (char)((current - 'a' + n) % 26 + 'a');
                result.append(encoded);
            } else if (Character.isUpperCase(current)) {
                char encoded = (char)((current - 'A' + n) % 26 + 'A');
                result.append(encoded);
            }
        }
        
        return result.toString();
    }
}