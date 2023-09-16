class Solution {
    String[] words =  {"zero",
                      "one",
                      "two",
                      "three",
                      "four",
                      "five",
                      "six",
                      "seven",
                      "eight",
                      "nine"};
    
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length();){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                sb.append(s.charAt(i++));
            } else {
                for (int j=0; j<10; ++j){
                    if(s.startsWith(words[j],i)){
                        sb.append((char)('0'+j));
                        i+=words[j].length();
                        break;
                    }
                }
            }
        }
        int answer = Integer.parseInt(sb.toString());
        return answer;
    }
}