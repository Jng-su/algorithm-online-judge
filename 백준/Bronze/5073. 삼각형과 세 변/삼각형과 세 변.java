import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            
            if (a == 0 && b == 0 && c == 0) {
                break; // 입력이 0 0 0일 경우 종료
            }
            
            if (isTriangle(a, b, c)) {
                if (a == b && b == c) {
                    System.out.println("Equilateral");
                } else if (a == b || b == c || a == c) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            } else {
                System.out.println("Invalid");
            }
        }
        
        br.close();
    }
    
    // 삼각형의 조건을 만족하는지 확인하는 함수
    public static boolean isTriangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        }
        return false;
    }
}
