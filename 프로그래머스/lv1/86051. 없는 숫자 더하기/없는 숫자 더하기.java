class Solution {
    public int solution(int[] numbers) {
        int missingSum = 0;

        for (int i = 0; i <= 9; i++) {
            boolean found = false;
            for (int num : numbers) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missingSum += i;
            }
        }

        return missingSum;
    }
}