package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main2164 {  // 카드2

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Deque<Integer> deque = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			deque.addLast(i);
		}
		
		
		while (deque.size() > 1) {  // 카드 한장이 남을 때까지 반복
			deque.pop();  // 1. 제일 위에 있는 카드 버리기
			deque.addLast(deque.pop());  // 2. 그 다음 카드 가장 마지막으로 삽입
			
			// 확인
			// System.out.println(deque);
		}
		
		System.out.println(deque.pop());  // 가장 마지막 카드의 번호 출력
	}

}
