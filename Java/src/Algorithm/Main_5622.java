package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_5622 {  // 다이얼

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String dial = br.readLine();
		
		int sum = 0;
		for (int i = 0; i < dial.length(); i++) {
			sum += ((int)dial.charAt(i) - 65)/3 + 2 + 1;
		}
		
		System.out.println(sum);
	}

}
