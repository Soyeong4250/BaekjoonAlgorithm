package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1940 {  // 주몽
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] num = new int[N];
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num);
		int sIdx = 0;
		int eIdx = N-1;
		int cnt = 0;
		
		while(sIdx < eIdx) {
			int sum = num[sIdx] + num[eIdx];
			if(sum < M) {  // 두 재료의 합이 M보다 작다면
				sIdx++;
			} else if(sum > M) {  // 두 재료의 합이 M보다 크다면
				eIdx--;
			} else {  // 두 재료의 합이 M과 같다면
				cnt++;
				sIdx++;
				eIdx--;
			}
		}
		System.out.println(cnt);
	}
}
