class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int num = left; num <= right; num++) {
            int divisorCount = getDivisorCount(num);
            answer += (divisorCount % 2 == 0) ? num : -num;
        }

        return answer;
    }

    private int getDivisorCount(int num) {
        int count = 0;
        int sqrtNum = (int) Math.sqrt(num);

        for (int i = 1; i <= sqrtNum; i++) {
            if (num % i == 0) {
                count += 2;
            }
        }
        if (sqrtNum * sqrtNum == num) {
            count--;
        }

        return count;
    }
}
