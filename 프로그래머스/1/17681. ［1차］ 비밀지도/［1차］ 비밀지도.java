class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            String binary = Integer.toBinaryString(arr1[i] | arr2[i]);
            String padded = String.format("%" + n + "s", binary).replace(' ', '0');
            result[i] = padded.replace('1', '#').replace('0', ' ');
        }
        return result;
    }
}

