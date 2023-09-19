import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken()); // 응시자의 수
        int k = Integer.parseInt(st.nextToken()); // 상을 받는 사람의 수
        
        int[] scores = new int[N];
        
        // 각 학생의 점수 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }
        
        // 점수를 내림차순으로 정렬
        Arrays.sort(scores);
        
        // 커트라인을 구하는 과정
        int cutoff = scores[N - k];
        
        System.out.println(cutoff);
    }
}
