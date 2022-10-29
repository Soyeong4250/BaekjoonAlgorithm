package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1253 {  // 좋다

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		long[] num = new long[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < num.length; i++) {
			num[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(num);
		
		int cnt = 0;
		
		for (int i = 0; i < num.length; i++) {
			int sIdx = 0;
			int eIdx = N-1;
			long target = num[i];
			while(sIdx < eIdx) {
				long sum = num[sIdx] + num[eIdx];
				System.out.println("target은 " + target + ", sum은 " + sum);
				if(sum < target) {  // 두 수의 합이 target보다 작으면
					sIdx++;
				} else if(sum > target) {  // 두 수의 합이 target보다 크면
					eIdx--;
				} else {  // 두 수의 합이 target과 같다면
					if(sIdx == i) {
						sIdx++;
					} else if(eIdx == i){
						eIdx--;
					} else {
						cnt++;
						break;
					}
				}
			}
		}
		
		System.out.println(cnt);
	}

}
