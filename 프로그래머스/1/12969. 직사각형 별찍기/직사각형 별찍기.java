import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 가로 길이 입력
        int m = sc.nextInt(); // 세로 길이 입력

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println(); // 한 행을 출력한 후 줄 바꿈
        }
    }
}
