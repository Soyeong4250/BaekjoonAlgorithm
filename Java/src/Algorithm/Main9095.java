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
		for (int t = 0; t < T; t++) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(main.solution(n));			
		}
	}

	private int solution(int n) {
		int[] dp = new int[n+1];
		dp[1] = 1;
		
		if(n == 1) {
			return dp[1];
		}
		
		dp[2] = 2;
		if(n == 2) {
			return dp[2];
		}
		
		dp[3] = 4;
		if(n == 3) {
			return dp[3];
		}
		
		for (int i = 4; i <= n; i++) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		
//		System.out.println(Arrays.toString(dp));
		return dp[n];
	}

}
