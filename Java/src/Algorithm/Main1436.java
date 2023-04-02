package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1436 { // 영화감독 숌

	public static void main(String[] args) throws NumberFormatException, IOException {
		Main1436 main = new Main1436();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
//		int N = 2;
//		int N = 3;
//		int N = 6;
//		int N = 187;
//		int N = 500;

		System.out.println(main.solution(N));
	}

	private int solution(int n) {
		int num = 665;
		
		while(n > 0) {
			num++;
			if(String.valueOf(num).contains("666")) {
				n--;
			}
		}
		
		return num;
	}

}
