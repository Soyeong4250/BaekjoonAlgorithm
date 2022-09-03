package Algorithm;

import java.util.Scanner;

public class Main_2018 {  // 수들의 합 5

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int sIdx = 1;
		int eIdx = 1;
		int sum = 1;
		int cnt = 1;  // 마지막 인덱스가 N과 같을 때 마지막 인덱스 하나만 뽑는 경우
		
		while(eIdx != N) {
			if(sum == N) {  // 현재 연속값이 N과 같다면
				cnt++;
				eIdx++;
				sum += eIdx;
			} else if (sum > N) {  // 현재 연속값이 N보다 크다면
				sum -= sIdx;  // 시작 인덱스 한 칸 오른쪽으로 이동
				sIdx++;
			} else {  // 현재 연속값이 N보다 작다면
				eIdx++;  // 마지막 인덱스 한 칸 오른쪽으로 이동
				sum += eIdx;  
			}
		}
		
		System.out.println(cnt);
	}

}
