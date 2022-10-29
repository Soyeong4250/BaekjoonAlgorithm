package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11720 {  //  숫자의 합

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String num = br.readLine();
		int sum = 0;
		for (int i = 0; i < num.length(); i++) {
			sum += num.charAt(i) - '0';
		}
		
		System.out.println(sum);
	}

}
