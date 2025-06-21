import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> sum = new HashSet<>();
        
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                sum.add(numbers[i] + numbers[j]);
            }
        }
        
        List<Integer> list = new ArrayList<>(sum);
        Collections.sort(list);
        
        int[] result = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}