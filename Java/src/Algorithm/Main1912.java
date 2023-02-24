package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1912 {  // 연속합

	public static void main(String[] args) throws IOException {
		Main1912 main = new Main1912();
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] number = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(main.solution(n, number));
	}
	
	private int solution(int n, int[] number) {
		int[] sum = new int[n];
		sum[0] = number[0];
		int max = sum[0];
		
		for (int i = 1; i < sum.length; i++) {
			sum[i] = Math.max(number[i] + number[i-1], Math.max(sum[i-1] + number[i], number[i]));
			if(max < sum[i]) max = sum[i];
		}
		
		return max;
	}
}
