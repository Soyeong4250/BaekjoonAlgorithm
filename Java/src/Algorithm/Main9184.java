package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main9184 { // 신나는 함수 실행

	public static void main(String[] args) throws IOException {
		Main9184 main = new Main9184();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tc;
		StringBuilder sb = new StringBuilder();
		while((tc = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(tc);
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a == -1 && b == -1 && c == -1) {
				System.out.println(sb.toString());
				return;
			}
			
			sb.append(main.solution(a, b, c)).append("\n");
		}
	}

	private String solution(int a, int b, int c) {
		StringBuilder sb = new StringBuilder();
//		long startTime = System.currentTimeMillis();
		int answer = recursive(a, b, c);
//		System.out.println("더하기");
		sb.append("w(").append(a).append(", ").append(b).append(", ").append(c).append(") = ").append(answer);
//		long endTime = System.currentTimeMillis();
//		System.out.println("걸린 시간 = " + (endTime - startTime));
		return sb.toString();
	}
	
	static int[][][] memo = new int[21][21][21];
	private int recursive(int a, int b, int c) {
		if(a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}
		
		if(a > 20 || b > 20 || c > 20) {
			return recursive(20, 20, 20);
		}
		
		if(a < b && b < c) {
			if(memo[a][b][c] != 0) return memo[a][b][c];
			
			memo[a][b][c] = recursive(a, b, c-1) + recursive(a, b-1, c-1) - recursive(a, b-1, c);
			return memo[a][b][c];
		}
		
		if(memo[a][b][c] != 0) return memo[a][b][c];
		else {
			memo[a][b][c] = recursive(a-1, b, c) + recursive(a-1, b-1, c) + recursive(a-1, b, c-1) - recursive(a-1, b-1, c-1);
			return memo[a][b][c];
		}
	}
}
