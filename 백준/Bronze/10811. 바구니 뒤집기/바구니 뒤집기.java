import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }

        for (int m = 0; m < M; m++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            reverseBaskets(baskets, start - 1, end - 1);
        }

        for (int i = 0; i < N; i++) {
            System.out.print(baskets[i] + " ");
        }
    }

    private static void reverseBaskets(int[] baskets, int start, int end) {
        while (start < end) {
            // swap
            int temp = baskets[start];
            baskets[start] = baskets[end];
            baskets[end] = temp;

            start++;
            end--;
        }
    }
}
