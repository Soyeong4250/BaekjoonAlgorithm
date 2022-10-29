package Algorithm;

import java.util.Scanner;

public class Main11022 {  // A+B-8

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); 
		for (int tc = 1; tc <= T; tc++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.printf("Case #%d: %d + %d = %d%n", tc, A, B, A+B);
		}
		sc.close();
	}

}

