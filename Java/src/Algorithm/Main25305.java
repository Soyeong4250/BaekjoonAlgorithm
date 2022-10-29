package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main25305 {  // 커트라인

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] score = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < score.length; i++) {
			score[i] = Integer.parseInt(st.nextToken());
		}
		Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
		Arrays.sort(arr, Collections.reverseOrder());
		
		System.out.println(arr[k-1]);
	}

}
