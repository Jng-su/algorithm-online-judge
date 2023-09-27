import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 상근이가 가지고 있는 숫자 카드의 개수 N
        int N = Integer.parseInt(br.readLine());

        // 상근이가 가지고 있는 숫자 카드를 저장하는 HashSet
        HashSet<Integer> cards = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cards.add(Integer.parseInt(st.nextToken()));
        }

        // 구해야 할 수의 개수 M
        int M = Integer.parseInt(br.readLine());

        // 각 수가 숫자 카드에 있는지 확인하여 결과를 출력
        st = new StringTokenizer(br.readLine());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (cards.contains(num)) {
                result.append("1 ");
            } else {
                result.append("0 ");
            }
        }

        System.out.println(result.toString().trim());

        br.close();
    }
}
