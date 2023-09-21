import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) {
            return new int[]{-1};
        }

        int min = Arrays.stream(arr).min().getAsInt(); // 배열에서 최소값 찾기

        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr) {
            if (num != min) {
                result.add(num);
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
