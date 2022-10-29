package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main1927 {  // 최소 힙

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		PriorityQueue<Integer> q = new PriorityQueue<>();
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			int number = Integer.parseInt(br.readLine());
			if(number == 0) {
				// System.out.println("현재 수는 " + i);
				if(!q.isEmpty()) {  // q가 비어있지 않다면
					System.out.println(q.poll());  // 가장 작은 수 poll() & 출력
				}else {
					System.out.println(0);
				}	
			} else {
				q.add(number);
			}
		}
	}
}
