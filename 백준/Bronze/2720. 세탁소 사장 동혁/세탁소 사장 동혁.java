import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int T=1; T<=t; T++) {
			int change = Integer.parseInt(br.readLine());
			// quarter dime nickel penny
			int quarter = 0;
			int dime = 0;
			int nickel = 0;
			int penny = 0;
			
			while (change>0) {
				if (change >= 25) {
                    quarter += change / 25;
                    change %= 25;
                } else if (change >= 10) {
                    dime += change / 10;
                    change %= 10;
                } else if (change >= 5) {
                    nickel += change / 5;
                    change %= 5;
                } else {
                    penny += change;
                    change = 0;
                }
			}
			
			System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
		}
	}

}
