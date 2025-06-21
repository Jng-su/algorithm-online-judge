class Solution {
    public int solution(int[] numbers) {
        boolean[] check = new boolean[10];
        for(int idx : numbers) check[idx] = true;
        int result = 0;
        for(int idx = 0; idx<check.length; idx++) if(!check[idx]) result+=idx;
        return result;
    }
}