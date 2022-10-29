package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main4344 {  // 평균은 넘겠지

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int[] num = new int[N];
			int sum = 0;
			for (int n = 0; n < N; n++) {
				num[n]= Integer.parseInt(st.nextToken());
				sum += num[n];
			}
			// System.out.println(sum);
			int avg = sum / N;
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				if(num[i] > avg) {
					// System.out.println("들어왔습니다");
					cnt++;
				}
			}
//			System.out.println(cnt);
			double result = (double)cnt/N*100;
//			System.out.println(result);
			System.out.printf("%.3f", result);
			System.out.println("%");
		}
	}

}
