package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_3052 {  // 나머지

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean[] is = new boolean[42];
		int cnt = 0;
		
		for (int i = 0; i < 10; i++) {
			int n = Integer.parseInt(br.readLine())%42;
			// System.out.println("n = " + n + "," + "is[n] = " + is[n]);
			if(is[n] == false) {
				is[n] = true;
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
