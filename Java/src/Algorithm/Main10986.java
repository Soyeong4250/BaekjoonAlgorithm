package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main10986 {  // 나머지 합 구하기

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		/*long[] sum = new long[N];
		
		sum[0] = Integer.parseInt(st.nextToken());	
		for (int i = 1; i < sum.length; i++) {
			sum[i] = sum[i-1] + Integer.parseInt(st.nextToken());
		}
		
		long[] remain = new long[M];
		for (int i = 0; i < sum.length; i++) {
			remain[(int)sum[i]%M]++;  // 나머지가 같은 수의 개수 구하기
		}*/
		
		long[] remain = new long[M];
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += Integer.parseInt(st.nextToken());
			int idx = sum%M;
			remain[idx]++;
		}
		
		
		System.out.println(Arrays.toString(remain));
		
		long result = remain[0];  // 범위가 1이고 나누어 떨어지는 수일때의 경우
		// 범위가 2이상이고 같은 수의 쌍이 나오는 경우의 수 구하기
		for (int i = 0; i < remain.length; i++) {
			if(remain[i] > 1) {  // 같은 수가 1개일 경우 범위를 구할 수 없음
				result += (remain[i] * (remain[i]-1) / 2);
			}
		}
		
		System.out.println(result);
		
	}
}
