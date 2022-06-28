package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1920 {  // 수 찾기

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] arr2 = new int[M];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < M; i++) {
			int result = 0;
			int idx = N/2;
			while(0 <= idx && idx < N) {
				if(arr2[i] == arr[idx]) {
					result = 1;
					break;
				}else if(arr2[i] < arr[idx]) {
					idx -= idx/2;
				}else {
					idx += idx/2;
				}
			}
			System.out.println(result);
		}
	}

}
