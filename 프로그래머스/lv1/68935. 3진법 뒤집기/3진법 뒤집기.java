class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder reversedTernary = new StringBuilder();

        // n을 3진법으로 변환하면서 뒤집은 결과를 reversedTernary에 저장합니다.
        while (n > 0) {
            int remainder = n % 3;
            reversedTernary.append(remainder);
            n /= 3;
        }

        // reversedTernary를 뒤집어서 3진법 형태로 만듭니다.
        String ternary = reversedTernary.toString();

        // 3진법을 10진법으로 변환합니다.
        int power = 0;
        for (int i = ternary.length() - 1; i >= 0; i--) {
            int digit = ternary.charAt(i) - '0';
            answer += digit * Math.pow(3, power);
            power++;
        }

        return answer;
    }
}
