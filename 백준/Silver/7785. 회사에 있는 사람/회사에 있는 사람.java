import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 로그에 기록된 출입 기록의 수
        HashSet<String> inCompany = new HashSet<>(); // 현재 회사에 있는 사람을 저장할 Set

        for (int i = 0; i < n; i++) {
            String[] log = br.readLine().split(" ");
            String name = log[0];
            String action = log[1];

            if (action.equals("enter")) {
                // 입실한 경우 Set에 추가
                inCompany.add(name);
            } else {
                // 퇴실한 경우 Set에서 제거
                inCompany.remove(name);
            }
        }

        // Set을 ArrayList으로 변환하여 정렬
        ArrayList<String> sortedList = new ArrayList<>(inCompany);
        Collections.sort(sortedList, Collections.reverseOrder());

        // 결과 출력
        for (String name : sortedList) {
            System.out.println(name);
        }
    }
}
