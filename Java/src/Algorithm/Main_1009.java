package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1009 {  // 분산처리

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a % 10 == 0) {
				sb.append(10 + "\n");
				continue;
			}
			int num = a % 10;
			for (int i = 1; i < b; i++) {
				num = (num * a) % 10;
			}
			sb.append(num + "\n");
		}
		
		System.out.println(sb);
	}

}
