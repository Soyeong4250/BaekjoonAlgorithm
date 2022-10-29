package Algorithm;

import java.util.Scanner;

public class Main9461 {  // 파도반 수열

	private long[] padovan(int size) {
		long[] sequence = new long[size+1];
		
		sequence[0] = sequence[1] = sequence[2] = 1;
		
		for (int i = 3; i <= size; i++) {
			sequence[i] = sequence[i-2] + sequence[i-3];
		}
		
		return sequence;
	}

	public static void main(String[] args) {
		Main9461 main = new Main9461();
		Scanner sc = new Scanner(System.in);
		
		long[] p = main.padovan(100);
		
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();
			System.out.println(p[N-1]);
		}
	}

}
