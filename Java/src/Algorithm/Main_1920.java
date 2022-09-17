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
		Arrays.sort(arr);  // 1. N개의 수 오름차순 정렬
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		// 2. 이진탐색
		for (int i = 0; i < M; i++) {
			int target = Integer.parseInt(st.nextToken());
			// 2-1. 중앙값(인덱스) 정하기
			int start = 0;
			int mid = 0;
			int end = N-1;
			
			boolean flag = false;
			while(start <= end) {
				mid = (start+end)/2;
				if(arr[mid] == target) {
					flag = true;
					break;
				}else if(arr[mid] < target) {  // 정렬된 배열 mid 인덱스의 값보다 target이 크다면
					start = mid+1;
				}else if(arr[mid] > target) {  // 정렬된 배열 mid 인덱스의 값이 target보다 크다면
					end = mid-1;
				}
			}
			
			if(flag) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
			
		}
	}

}
