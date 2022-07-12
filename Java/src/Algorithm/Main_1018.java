package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1018 { // 체스판 다시 칠하기
	static int N,M;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		// 입력
		char[][] board = new char[N][M];
		int sr = 0;
		int sc = 0;
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			char ch = str.charAt(0);
			for (int j = 0; j < M; j++) {
				board[i][j] = str.charAt(j);
				if(0 != j && board[i][j] == ch) {
					
				}
			}
		}
		
		char pre = board[0][0];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if()
			}
		}
	}

}
