package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2293 {  // 동전 1

	public static void main(String[] args) throws IOException {
		Main2293 main = new Main2293();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] coins = new int[n];
		
		for (int i = 0; i < coins.length; i++) {
			coins[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println(main.solution(n, k, coins));
	}

	private int solution(int n, int k, int[] coins) {
		int[] dp = new int[k+1];
		
		dp[0] = 1;
		
		for (int i = 0; i < n; i++) {
			for (int j = coins[i]; j <= k; j++) {
				dp[j] += dp[j - coins[i]];
				System.out.println("dp[" + j + "]" + "= dp[" + j + "] + dp[" + j + "- coins[" + i + "]]; : " +  dp[j]  + "=" +  dp[j] + "+" + dp[j - coins[i]]);
			}
		}
		
		return dp[k];
	}

}
