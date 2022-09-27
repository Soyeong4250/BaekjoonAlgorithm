package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;

public class Main_1377 {  // 버블 소트

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		int[] arr2 = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = num;
			arr2[i] = num;
		}
		
		Arrays.sort(arr2);  // 정렬
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr2.length; j++) {
				
			}
		}
		
	}

}
