package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_11660 {  // 구간 합 구하기 5

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[N+1][N+1];
		int[][] sum = new int[N+1][N+1];
		
		// 배열 입력
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				sum[i][j] = sum[i][j-1] + sum[i-1][j] - sum[i-1][j-1] + arr[i][j];
			}
		}
		
		// 입력 확인
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(Arrays.toString(arr[i]));			
//		}
//		

		for (int i = 1; i < sum.length; i++) {
			System.out.println(Arrays.toString(sum[i]));			
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int result = sum[x2][y2] - sum[x1-1][y2] - sum[x2][y1-1] + sum[x1-1][y1-1];
			System.out.println(result);
		}
		
	}

}
