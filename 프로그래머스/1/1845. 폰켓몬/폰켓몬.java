import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int max = nums.length / 2; // 선택해야 하는 폰켓몬의 최대 개수
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int uniqueCount = set.size(); // 중복을 제외한 종류의 수

        return Math.min(max, uniqueCount);
    }
}
