package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_8958 {  // OX퀴즈

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
			int cnt = 0;
			int sum = 0;
			String str = br.readLine();
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == 'O') {
					cnt++;
					sum += cnt;
					// System.out.println("0 : " + cnt + "," + sum);  // 확인
				}else {
					cnt = 0;
					// System.out.println("X : " + cnt + "," + sum);  // 확인
				}
			}
			System.out.println(sum);
		}
	}

}
