class Solution {
    public String solution(String s) {
        String[] numbers = s.split(" "); // 문자열을 공백으로 분리하여 문자열 배열로 저장
        int min = Integer.MAX_VALUE; // 최소값 초기화
        int max = Integer.MIN_VALUE; // 최대값 초기화

        for (String numStr : numbers) {
            int num = Integer.parseInt(numStr); // 문자열을 정수로 변환
            min = Math.min(min, num); // 현재 숫자가 최소값보다 작으면 최소값 업데이트
            max = Math.max(max, num); // 현재 숫자가 최대값보다 크면 최대값 업데이트
        }

        return min + " " + max; // 최소값과 최대값을 문자열로 반환
    }
}
