class Solution {
    public int solution(int[][] sizes) {
        int maxX = 0;
        int maxY = 0;
        
        // 가로 길이를 큰 걸로 대체한다.
        for (int i=0; i<sizes.length; i++) {
            int x = Math.max(sizes[i][0], sizes[i][1]);
            int y = Math.min(sizes[i][0], sizes[i][1]);
            maxX = Math.max(x, maxX);
            maxY = Math.max(y, maxY);
        }
        
        return maxX * maxY;
    }
}