package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main1966_F {  // 프린터 큐
	class print {
		int importance;  // 출력해야 할 문서의 중요도
		int index;  // 출력해야 할 문서의 현재 인덱스
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());  // 테스트 케이스
		
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());  // 문서의 개수
			int M = Integer.parseInt(st.nextToken());  // 궁금한 문서의 Queue에서의 위치
			int print = 0;  // 출력해야 할 문서 인덱스
			int cnt = 0;  // 몇번째로 출력?
			
			Deque<Integer> q = new LinkedList<>();
			
			st = new StringTokenizer(br.readLine());
			// 입력
			for (int i = 0; i < N; i++) {
				if(i == M) {  // 원하는 문서일 때
					print = i;  // 인덱스 입력
				}
				q.add(Integer.parseInt(st.nextToken()));
			}
			
			// 확인 
			// System.out.println(q);
			
			while(true) {
				int tmp = q.poll();  // 가장 앞의 숫자  
				
				if(q.isEmpty()) {
					break;
				}
			}
			
		}
		
	}

}
