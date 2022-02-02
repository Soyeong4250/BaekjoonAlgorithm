package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 소수(Prime Number)란?
 * 1보다 큰 양의 정수 중 약수가 1과 자기자신뿐인 수
 * ----------------------------------------
 * 활용 알고리즘 : 에라토스테네스의 체 (약수의 성질 적용) 
 * 메모리 : 14124KB 
 * 시간 :  124ms
 * 시간복잡도 : O(Nlog(logN))
 */
public class Main_1978 {  // 소수 찾기

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력받기
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int cnt = N;
		
		while(st.hasMoreTokens()) {  // 토큰이 남아있는 동안 반복
			int num = Integer.parseInt(st.nextToken());

			if(num <= 1) {
				cnt--;
				System.out.println(num + "은 소수가 아닙니다.");
				continue;
			}
			
			for (int i = 2; i <= Math.sqrt(num); i++) {  // 2의 절댓값이 2보다 같거나 크지 않으므로 i=2인 경우도 패쓰
				
				if(num%i==0) {
					cnt--;
					System.out.println("소수가 아닌 수 : " + num);
					break;
				}
			}
		}
		
		System.out.println(cnt);
	}

}
