package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_11899 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int cnt = 0;
		
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			if(!stack.isEmpty()) {
				if(stack.peek() == '(' && str.charAt(i) == ')') {
					stack.pop();
				}else {
					stack.push(str.charAt(i));
				}
			} else {
				stack.push(str.charAt(i));				
			}
		}
		
		// 확인
		System.out.println(stack);
		
		while(!stack.isEmpty()) {
			stack.pop();
			cnt++;
		}
		
		System.out.println(cnt);
		
	}

}
