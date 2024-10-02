public class Main {
    public static void main(String[] args) {
        boolean[] check = new boolean[10001];
        for (int i = 1; i <= 10000; i++) {
            int num = i;

            // 각 자릿수를 더하는 로직
            char[] temp = String.valueOf(i).toCharArray();
            for (char c : temp) {
                num += c - '0';
            }

            if (num <= 10000) {
                check[num] = true;
            }
        }

        for (int i = 1; i < check.length; i++) {
            if (!check[i]) System.out.println(i);
        }
    }
}
