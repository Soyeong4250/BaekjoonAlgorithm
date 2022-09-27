package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Main_11399 {  // ATM

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] time = new int[N];
		
		for (int i = 0; i < time.length; i++) {
			time[i] = sc.nextInt();
		}
		
		Arrays.sort(time);
		
		int answer = 0;
		int sum = 0;
		for (int i = 0; i < time.length; i++) {
			sum += time[i];
			answer += sum;
		}
		
		System.out.println(answer);
	}

}
