package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11654 {  // 아스키코드

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char ascii = br.readLine().charAt(0);
		System.out.println((int)ascii);
	}

}
