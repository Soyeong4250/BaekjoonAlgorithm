package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_17298 {  // 오큰수

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		Stack<Integer>stack = new Stack<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringBuilder sb  = new StringBuilder();
		int num = 0;
		for (int i = 0; i < N; i++) {
			num = Integer.parseInt(st.nextToken());
			if(!stack.isEmpty() && stack.peek() < num && i != N-1) {
				sb.append(num + " ");
				stack.pop();
				stack.push(num);
			} else {
				stack.push(num);
			}
			System.out.println("num은 " + num);
			System.out.println(stack);
			System.out.println(sb.toString());
		}
		
		while(!stack.isEmpty()) {
			if(stack.peek() < num) {
				
			} else {
				
			}
		}
		
		int[] result = new int[N];
		for (int i = 0; i < N; i++) {
			
		}
	}

}
