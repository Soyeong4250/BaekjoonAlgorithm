package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main10845 {  // 큐

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new ArrayDeque<>();
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			int number = 0;
			if(st.hasMoreTokens()) {
				number = Integer.parseInt(st.nextToken());
//				System.out.println(number);  // 확인
			}
			
			if(command.equals("push")) {
				deque.add(number);
//				result = number;
			}else if(command.equals("pop")) {
				if(deque.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(deque.pop());
				}
			}else if(command.equals("size")) {
				System.out.println(deque.size());
			}else if(command.equals("empty")) {
				if(deque.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}else if(command.equals("front")) {
				if(deque.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(deque.getFirst());
				}
			}else if(command.equals("back")) {
				if(deque.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(deque.getLast());
				}
			}
		}
	}
}