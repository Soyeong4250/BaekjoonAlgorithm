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
			char ch = dial.charAt(i);
			
			if(ch <= 'O') {
				sum += ((int)ch - 65)/3 + 2 + 1;
			} else if('P' <= ch && ch <= 'S') {
				sum += 8;
			} else if('T' <= ch && ch <= 'V') {
				sum += 9;
			} else if('W' <= ch && ch <= 'Z') {
				sum += 10;
			}
		}
		
		System.out.println(sum);
	}

}
