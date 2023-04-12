package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main2583 {  // 영역 구하기

	static List<Integer> width;
	static int area = 0;
	public static void main(String[] args) throws IOException {
		Main2583 main = new Main2583();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[n][m];
		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			int sr = Integer.parseInt(st.nextToken());
			int sc = Integer.parseInt(st.nextToken());
			int er = Integer.parseInt(st.nextToken());
			int ec = Integer.parseInt(st.nextToken());
			for (int r = sr; r < er; r++) {
				for (int c = sc; c < ec; c++) {
					map[r][c] = 1;
				}
			}
		}
		
		// 확인
		for (int i = 0; i < map.length; i++) {
			System.out.println(Arrays.toString(map[i]));
		}
		
		int cnt = 0;
		width = new ArrayList<>();
		int[] dr = {-1, 0, 1, 0};
		int[] dc = {0, 1, 0, -1};
		boolean[][] visit = new boolean[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(map[i][j] == 0 && !visit[i][j]) {
					visit = main.bfs(map, i, j, dr, dc, visit);
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		Collections.sort(width);
		StringBuilder answer = new StringBuilder();
		for (int w : width) {
			answer.append(w).append(" ");
		}
		System.out.println(answer.toString().trim());
	}

private boolean[][] bfs(int[][] map, int i, int j, int[] dr, int[] dc, boolean[][] visit) {
	Queue<int[]> q = new LinkedList<>();
	
	q.add(new int[]{i, j});
	visit[i][j] = true;
	int sum = 0;
	
	while(!q.isEmpty()) {
		int[] spot = q.poll();
		sum++;
		
		for (int d = 0; d < dr.length; d++) {
			int nr = spot[0] + dr[d];
			int nc = spot[1] + dc[d];
			
			if(0 <= nr && nr < map.length && 0 <= nc && nc < map[0].length && map[nr][nc] == 0 && !visit[nr][nc]) {
				visit[nr][nc] = true;
				q.add(new int[]{nr, nc});
			}
		}
	}
	
	width.add(sum);
	return visit;
}

}
