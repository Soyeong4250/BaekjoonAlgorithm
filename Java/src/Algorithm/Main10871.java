package Algorithm;

import java.util.Scanner;

public class Main10871 {  // X보다 작은 수

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int[] arr = new int[N];
		// 입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < X) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
