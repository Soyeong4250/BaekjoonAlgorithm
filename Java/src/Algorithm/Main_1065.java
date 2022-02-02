package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1065 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for (int i = 1; i <= N; i++) {
			if(i < 100) {
				cnt++;
			}else{
				String str = Integer.toString(i);
				int[] num = new int[str.length()];
				for (int j = 0; j < str.length(); j++) {
					num[j] = str.charAt(j) - '0';
				}
				for (int j = 1; j < num.length-1; j++) {
					if(num[j-1]-num[j] == num[j]- num[j+1]) {
						cnt++;
					}else {
						break;
					}
				}
			}
		}
		System.out.println(cnt);
	}

}
