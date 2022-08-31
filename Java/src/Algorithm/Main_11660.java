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
		
		int[][] arr = new int[N][N];
		int[][] sum = new int[N][N];
		
		// 배열 입력
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				
				if(i==0 && j==0) {
					sum[i][j] = arr[0][0];
				} else if(j == 0){
					sum[i][j] = sum[i-1][N-1] + arr[i][j];
				} else {
					sum[i][j] = sum[i][j-1] + arr[i][j];
				}
			}
		}
		
		
		// 입력 확인
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(Arrays.toString(arr[i]));			
//		}
//		

		for (int i = 0; i < sum.length; i++) {
			System.out.println(Arrays.toString(sum[i]));			
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken())-1;
			int y1 = Integer.parseInt(st.nextToken())-1;
			int x2 = Integer.parseInt(st.nextToken())-1;
			int y2 = Integer.parseInt(st.nextToken())-1;
			
			if(x1 == 0 && y1 == 0) {  // 처음부터의 구간 합을 구해야한다면
				System.out.println(sum[x2][y2]);
			} else if (x1 >= 1 && y1-1 < 0) {  // 이전 행까지의 합을 빼야한다면
				System.out.println(sum[x2][y2] - sum[x1-1][N-1]);
			} else {
				System.out.println(sum[x2][y2] - sum[x1][y1-1]);
			}
		}
		
	}

}
