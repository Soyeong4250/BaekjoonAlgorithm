package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 소수(Prime Number)란?
 * 1보다 큰 양의 정수 중 약수가 1과 자기자신뿐인 수
 * ----------------------------------------
 * 활용 알고리즘 : 에라토스테네스의 체 (약수의 성질 적용) 
 * 메모리 : 30504KB 
 * 시간 :  1040ms
 * 시간복잡도 : O(Nlog(logN))
 */
public class Main_1929 {  // 소수 구하기

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		boolean prime[] = new boolean[M+1];
		Arrays.fill(prime, true);
		
		for (int i = N; i <= M; i++) {
			if(i==1) {
				prime[i] = false;
				continue;
			}
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if(i%j == 0) {
					prime[i] = false;
					break;
				}
			}
		}
		
		for (int i = N; i < M+1; i++) {
			if(prime[i] == true) {
				System.out.println(i);
			}
		}

	}	

}
