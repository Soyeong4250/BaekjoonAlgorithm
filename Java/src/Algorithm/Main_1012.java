package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1012 { // 유기농 배추

	static int M, N, K;
	static int[][] map;
	static boolean[][] v;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			M = Integer.parseInt(st.nextToken()); // 가로
			N = Integer.parseInt(st.nextToken()); // 세로
			K = Integer.parseInt(st.nextToken()); // 배추가 심어져 있는 위치의 개수(노드 정보)
			int cnt = 0; // 지렁이 수

			map = new int[N][M];
			v = new boolean[N][M];
			for (int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				map[y][x] = 1;
			}

			// 입력확인
			// print(map);

			// 배추 무더기 찾기
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (v[i][j] == false && map[i][j] == 1) {
						cnt++;
						dfs(i, j);
					}
				}
			}
			System.out.println(cnt);
		}

	}

	static int[] dr = { -1, 1, 0, 0 }; // 상하좌우
	static int[] dc = { 0, 0, -1, 1 };

	private static void dfs(int x, int y) {
		v[x][y] = true; // 방문처리

		for (int idx = 0; idx < 4; idx++) {
			int nr = x + dr[idx];
			int nc = y + dc[idx];
			if (0 <= nr && nr < N && 0 <= nc && nc < M && !v[nr][nc] && map[nr][nc] == 1) {
				dfs(nr, nc);
			}
		}
	}

	private static void print(int[][] map) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}

}
