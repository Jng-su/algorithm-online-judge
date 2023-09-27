import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0; // 소수의 합을 저장할 변수
        int minPrime = -1; // 최솟값을 저장할 변수

        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                sum += i; // 소수일 경우 sum에 더함
                if (minPrime == -1 || i < minPrime) {
                    minPrime = i; // 최솟값 업데이트
                }
            }
        }

        if (minPrime == -1) {
            System.out.println("-1"); 
        } else {
            System.out.println(sum);
            System.out.println(minPrime);
        }

        br.close();
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
