package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main12865 {  // 평범한 배낭
	
	public static void main(String[] args) throws IOException {
		Main12865 main = new Main12865();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[][] things = new int[N+1][2];
		
		for (int i = 1; i < things.length; i++) {
			st = new StringTokenizer(br.readLine());
			things[i][0] = Integer.parseInt(st.nextToken());
			things[i][1] = Integer.parseInt(st.nextToken());
		}

		System.out.println(main.solution(N, K, things));
	}

	private int solution(int N, int K, int[][] things) {
		
		int[][] memo = new int[N+1][K+1];
		for (int i = 0; i < memo[0].length; i++) {
			memo[0][i] = 0;
		}
		
		for (int i = 1; i < memo.length; i++) {
			for (int j = 1; j < memo[i].length; j++) {
//				System.out.println("things[i-1][0] = " + things[i][0] + ", j = " + j);
				if(things[i][0] > j) {  // 아이템 무게가 현재 제한 무게보다 초과한 경우
					memo[i][j] = memo[i-1][j];
				} else {
					memo[i][j] = Math.max(memo[i-1][j], memo[i-1][j-things[i][0]] + things[i][1]);
				}
			}
			print(memo);
		}
		
		return memo[N][K];
	}
	
	public void print(int[][] memo) {
		for (int i = 0; i < memo.length; i++) {
			for (int j = 0; j < memo[i].length; j++) {
				System.out.print(memo[i][j] + " ");
			}System.out.println();
		}
		System.out.println("------------");
	}

}
