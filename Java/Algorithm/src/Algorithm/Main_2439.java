package Algorithm;

import java.util.Scanner;

public class Main_2439 {  // 별 찍기 - 2

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N-(i+1); j++) {
				System.out.print(" ");
			}
			for (int j = N-(i+1); j < N; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}

}
