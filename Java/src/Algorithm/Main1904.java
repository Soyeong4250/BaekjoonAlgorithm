package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1904 {  // 01 타일

	public static void main(String[] args) throws IOException {
		Main1904 main = new Main1904();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		System.out.println(main.solution(N));
	}

	private int solution(int N) {
		if(N == 1) return 1;
		if(N == 2) return 2;
		
		int val1 = 2;
		int val2 = 1;
		int sum = 0;
		
		for(int i=3; i<=N; i++) {
			sum = (val1 + val2) % 15746;
			val2 = val1;
			val1 = sum;
		}
		return sum;
	}
	
}
