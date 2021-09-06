package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
	 
public class Main_1546 {  // 평균

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] score = new int[N];
		int max = 0;
		double sum = 0.0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			score[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, score[i]);
			// System.out.println(max);
		}
		
		for (int i = 0; i < N; i++) {
			sum += (double)score[i]/max*100;
			// System.out.println(sum);
		}
		
		System.out.printf("%.6f%n", sum/N);
	}
}
