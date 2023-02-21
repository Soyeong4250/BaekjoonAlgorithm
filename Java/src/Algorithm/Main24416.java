package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main24416 { // 알고리즘 수업 - 피보나치 수1

	public static void main(String[] args) throws NumberFormatException, IOException {
		Main24416 main = new Main24416();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		main.solution(n);
	}

	static int cnt1 = 0;
	static int cnt2 = 0;	
	private void solution(int n) {
		
		topDown(n);
		bottomUp(n);
		
		System.out.println(cnt1 + " " + cnt2);
		
	}

	private int topDown(int n) {
		if (n <= 2) {
			cnt1 += 1;
			return 1;
		} else {
			return topDown(n-1) + topDown(n-2);
		}
	}

	private int bottomUp(int n) {
		int[] dp = new int[n+1];
		
		if(n <= 2) {
			dp[n] = 1;
		} 
		
		for (int i = 3; i <= n; i++) {
			cnt2 += 1;
			dp[n] = dp[n-1] + dp[n-2];
		}
		
		return dp[n];
	}
}
