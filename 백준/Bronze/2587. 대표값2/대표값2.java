import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] numbers = new int[5];
        
        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(numbers);
        int median = numbers[2]; 
        
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += numbers[i];
        }
        int average = sum / 5;
        
        System.out.println(average);
        System.out.println(median);
    }
}
