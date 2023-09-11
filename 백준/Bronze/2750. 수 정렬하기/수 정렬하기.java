import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 수의 개수 입력
        int[] arr = new int[N]; // 수를 저장할 배열 생성

        // 수 입력
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // 퀵 소트를 사용하여 배열을 오름차순으로 정렬
        Arrays.sort(arr);

        // 정렬된 수 출력
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}