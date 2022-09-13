package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10757 {  // 큰 수 A + B

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();
		
		int aIdx = A.length()-1;
		int bIdx = B.length()-1;
		StringBuilder sb = new StringBuilder();
		int num = 0;
		while(aIdx >= 0 && bIdx >= 0) {
			int sum = (A.charAt(aIdx) - '0') + (B.charAt(bIdx) - '0');
			sb.append(sum + num);
			if(sum >= 10) {
				num = sum/10;
			}
			aIdx--;
			bIdx--;
			System.out.println(sb.toString());
		}
	}

}
