package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_10986 {  // 나머지 합 구하기

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] sum = new int[N];
		
		sum[0] = Integer.parseInt(st.nextToken());
		
		for (int i = 1; i < sum.length; i++) {
			sum[i] = sum[i-1] + Integer.parseInt(st.nextToken());
		}
		
		int result = 0;
		for (int i = 0; i < sum.length; i++) {
			if(sum[i]%M == 0) {
				sum[i] = 0;
			}else {
				sum[i] = 1;
				result+=1;
			}
		}
		
		// 같은 수의 쌍이 나올 경우
		
		
		
		
	}
}
