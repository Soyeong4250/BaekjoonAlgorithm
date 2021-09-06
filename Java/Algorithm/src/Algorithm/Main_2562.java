package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2562 {  // 최댓값 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] arr1 = new int[9];
		System.arraycopy(arr, 0, arr1, 0, arr.length);
		Arrays.sort(arr1);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == arr1[8]) {
				System.out.println(arr[i]);
				System.out.println(i+1);
			}
		}

	}

}
