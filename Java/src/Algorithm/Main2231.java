package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 활용 알고리즘 : 브루트포스
 * 메모리 : 14320KB
 * 시간 : 144ms
 */
public class Main2231 { // 분해합

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 분해합
		int N = Integer.parseInt(br.readLine());
		// 생성자 구하기
		int result = 0;
		
		for (int i = 1; i < N; i++) {
//			System.out.println("i= " + i);
			// 각 자리수의 합
			int sum = getCipherSum(i);
//			System.out.println("sum = " + sum);
			if(N == (i+sum)) {
//				System.out.println("N과 같음");
				result = i;
				break;
			}
			if(i == N-1) {
				break;
			}
		}
		
		System.out.println(result);
	}

	private static int getCipherSum(int n) {
		int sum = 0;
		
		while(n > 0) {
			sum += n%10;
			n /= 10;
//			System.out.println(sum);
		}
		
		return sum;
	}

}
