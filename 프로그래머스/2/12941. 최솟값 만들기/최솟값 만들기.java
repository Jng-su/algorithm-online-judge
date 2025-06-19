import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B) {
        Arrays.sort(A);
        for (int i=0; i<B.length; i++) {
            B[i] = -B[i];
        }
        Arrays.sort(B);
        for(int i=0; i<B.length; i++) {
            B[i] = -B[i];
        }
        // A는 오름차순
        // B는 내림차순
        
        int minResult = 0;
        for(int i=0; i<A.length; i++){
            minResult += A[i] * B[i];
        }
        return minResult;
    }
}