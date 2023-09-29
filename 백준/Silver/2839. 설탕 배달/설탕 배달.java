import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine()); // 설탕의 무게
        
        int count = 0; // 봉지의 개수
        
        while (N > 0) {
            if (N % 5 == 0) {
                // 5킬로그램 봉지로 나누어 떨어지면 5킬로그램 봉지를 사용
                N -= 5;
                count++;
            } else if (N % 3 == 0) {
                // 3킬로그램 봉지로 나누어 떨어지면 3킬로그램 봉지를 사용
                N -= 3;
                count++;
            } else if (N > 5) {
                // 5킬로그램 봉지로 나누어 떨어지지 않으면 5킬로그램 봉지를 하나 더 사용
                N -= 5;
                count++;
            } else {
                // 3킬로그램 봉지와 5킬로그램 봉지로 나눌 수 없는 경우
                count = -1;
                break;
            }
        }
        
        System.out.println(count);
    }
}
