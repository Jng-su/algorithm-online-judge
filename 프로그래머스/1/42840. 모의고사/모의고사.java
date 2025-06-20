import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] score = new int[3];
        
        // 수포자들
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] thr = {3,3,1,1,2,2,4,4,5,5};
        
        // 수포자들 점수 계산
        for(int i=0; i<answers.length; i++) {
            if (answers[i] == one[i%one.length]) score[0]++;
            if (answers[i] == two[i%two.length]) score[1]++;
            if (answers[i] == thr[i%thr.length]) score[2]++;
        }
        
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        
        // 최고 점수를 담는 리스트
        List<Integer> stu = new ArrayList<Integer>();
        for(int i=0; i<score.length; i++) if (maxScore == score[i]) stu.add(i+1);
        
        // 리스트 -> 배열
        int[] result = new int[stu.size()];
        for (int i=0; i<stu.size(); i++) {
            result[i] = stu.get(i);
        }
        
        
        return result;
    }
}