package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11726 {  // 2 X n 타일링

	public static void main(String[] args) throws NumberFormatException, IOException {
		Main11726 main = new Main11726();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(main.solution(n));
	}

	private int solution(int n) {
		int[] dp = new int[1001];
		dp[1] = 1;
		dp[2] = 2;
		
		for (int i = 3; i < dp.length; i++) {
			dp[i] = (dp[i-1] + dp[i-2]) % 10007;
		}
		
		return dp[n];
	}

}
