import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

class Member {
    int age;
    String name;
    int idx;

    public Member(int age, String name, int idx) {
        this.age = age;
        this.name = name;
        this.idx = idx;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        ArrayList<Member> members = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String[] inputs = br.readLine().split(" ");
            int age = Integer.parseInt(inputs[0]);
            String name = inputs[1];
            members.add(new Member(age, name, i));
        }

        members.sort(Comparator.comparingInt((Member item) -> item.age).thenComparingInt(item -> item.idx));

        StringBuilder sb = new StringBuilder();
        for (Member member : members) {
            sb.append(member.age).append(" ").append(member.name).append("\n");
        }
        System.out.println(sb);
    }
}
