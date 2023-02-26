package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main9095 { // 1, 2, 3 더하기

	public static void main(String[] args) throws NumberFormatException, IOException {
		Main9095 main = new Main9095();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for (int t = 0; t < T; t++) {
			int n = Integer.parseInt(br.readLine());
			sb.append(main.solution(n)).append("\n");			
		}
		System.out.println(sb.toString());
	}

	private int solution(int n) {
		int[] dp = new int[11];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for (int i = 4; i <= n; i++) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		
//		System.out.println(Arrays.toString(dp));
		return dp[n];
	}

}