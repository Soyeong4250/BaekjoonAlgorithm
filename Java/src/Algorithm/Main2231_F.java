package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 활용 알고리즘 : 브루트포스
 * 메모리 : 
 * 시간 : 
 */
public class Main2231_F {  // 분해합

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 분해합
		int N = Integer.parseInt(br.readLine());
		// 생성자
		System.out.println((int)(Math.log10(3)+1));
		int cnt = 9 * (int)(Math.log10(N)+1);  // N의 자리수 * 9
		int i = 1;
		int n = N - cnt;
		int M = n;
		int result = M;
		
		if(cnt != 1) {
			while(true) {
				result = M;
	//			System.out.println(M);
	//			System.out.println("안에 있는 while문");
				
				while(n!=0) {
					M += n % 10;
					n /= 10;
	//				System.out.println(M);
				}
	//			System.out.println("while문 밖에 나왔당");
				if(M == N) {
	//				System.out.println("M이랑 N이랑 같아요!");
					break;
				}
				n = (N-cnt) + i;
				M = n;
				i++;
			}
		}else {
				result = N;
		}
		
		// System.out.println("정답은!!" + result);
		System.out.println(result);
	}

}
