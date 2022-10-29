package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main11279 {  // 최대 힙

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			int number = Integer.parseInt(br.readLine());
			
			if(number == 0) {
				if(!q.isEmpty()) {
					System.out.println(q.poll());  // 가장 큰 수를 q에서 poll() & 출력
				} else {
					System.out.println(0);
				}
			} else {
				q.add(number);
			}
		}
	}

}
