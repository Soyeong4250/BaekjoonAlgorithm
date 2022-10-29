package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10451 { // 순열 사이클

	static int cnt;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());
			int[] adj = new int[N + 1]; // 인접정점 표시
			boolean[] visited = new boolean[N + 1];
			cnt = 0;
			
			// 인접행렬 정보 입력
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				int spot = Integer.parseInt(st.nextToken());
				adj[i+1] = spot; 
			}
		
//			for (int i = 0; i < adj.length; i++) {
//				System.out.println(Arrays.toString(adj[i]));
//				
//			}

			for (int i = 1; i < adj.length; i++) {
				if(!visited[i] && adj[i] != 0) {  // 방문하지 않은 정점이고 i정점에서 인접한 정점이 있다면
					visited[i] = true;
					isCycle(adj, visited, i);
				}
			}
			
			System.out.println(cnt);
		}
	}
	
	private static void isCycle(int[] adj, boolean[] visited, int idx) {
		if(adj[idx] != 0) {  // 인접한 정점이 있다면
			if(visited[adj[idx]]) {  // 이미 방문했던 정점이라면
				cnt++;  // 사이클 맞음
				return;
			} else {  // 방문하지 않은 정점이라면
				visited[adj[idx]] = true;  // 방문 표시
				isCycle(adj, visited, adj[idx]);  // 다음 정점으로 넘어가서 다시 사이클 유무 판단
			}
		}
	}

}
