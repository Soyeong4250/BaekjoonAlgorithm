package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2606 {

	static boolean[][] adj;  // 인접행렬
	static int cnt;  // 바이러스에 감염된 컴퓨터 수
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int com = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		adj = new boolean[com+1][com+1];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			adj[from][to] = adj[to][from] = true;  // 연결되어 있음
		}
		
		// 입력 확인
		// print(adj, com);
		
		int start = 1;  // 1번 바이러스 감염
		cnt = 0;
		dfs(start, new boolean [com+1], com);
		System.out.println(cnt);

	}
	
	private static void dfs(int current, boolean[] v, int com) {
		v[current] = true;
		
		for (int i = 1; i <= com; i++) {
			if(v[i] == false && adj[current][i]) {
				cnt++;
				dfs(i, v, com);
			}
		}
	}

	private static void print(boolean[][] adj, int com) {
		for (int i = 1; i <= com; i++) {
			for (int j = 1; j <= com; j++) {
				System.out.print(adj[i][j] + " ");
			}System.out.println();
		}
	}

}
