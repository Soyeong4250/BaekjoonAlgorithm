package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2667_F {  // 단지번호붙이기

	static class Home {
		int x;
		int y;
		
		public Home(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		
	}
	
	static int[][] map;
	static int N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		boolean[][] visited = new boolean[N][N];
		boolean isStart = false;
		Home sHome = new Home(0, 0);
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				map[i][j] = str.charAt(j)-'0';
				if(isStart == false && map[i][j] == 1) {
					sHome.x = i;
					sHome.y = j;
					isStart = true;
				}
				
				if(map[i][j] == 0) {
					visited[i][j] = true;
				}
			}
		}
		
		// map 입력 확인
		// print(map);

		visited[sHome.x][sHome.y] = true;
		dfs(sHome, visited);
	}

	private static void dfs(Home sHome, boolean[][] visited) {
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				
			}
		}
		
	}

	private static void print(int[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}

}
