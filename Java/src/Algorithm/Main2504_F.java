package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main2504_F { // 괄호의 값

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		char[] arr = str.toCharArray();

		print(arr);

		Stack<Character> stack = new Stack<>();
//		boolean error = false;
		int result = 0; // 결과

		for (int i = 0; i < arr.length; i++) {
			System.out.println(stack);
//			if (stack.isEmpty()) {
//				System.out.println("빈 stack");
//				// System.out.println(arr[i]);
//				if (arr[i] == ')' || arr[i] == ']') {
//					result = 0;
//					error = true;
//					System.out.println("error");
//					break;
//				} else {
//					stack.push(arr[i]);
//				}
//			} else {
				if (arr[i] == '(' || arr[i] == '[') {
					stack.push(arr[i]);
					// System.out.println(stack.peek());
				} else if (arr[i] == ')') { // 닫는 괄호가 나올때까지 더하기
					if(stack.isEmpty() || stack.peek() == '[') {
//						error = true;
						System.out.println(0);
						return;
					}
//					while (stack.peek() != '(' || stack.peek() != '[') {
//						System.out.println("지금 숫자는 " + (stack.peek() - '0'));
//						result += stack.pop() - '0';
//					}
					
					while (true) {
						if(stack.isEmpty() || stack.peek() == '[') {
//							error = true;
							System.out.println(0);
							return;  // main 종료
						}
						if(stack.peek() == '(') break;
						result += stack.pop() - '0';
					}
					
					if (result == 0)
						result = 1;
					result *= 2;
					stack.pop(); // ( pop
					stack.push((char) (result + '0')); // 덧셈 결과 숫자로 넣어주기
					System.out.println("가장 top 숫자는 " + (stack.peek() - '0'));
					result = 0;
				} else if (arr[i] == ']') { // 닫는 괄호가 나을때까지 더하기
					if(stack.isEmpty() || stack.peek() == '(') {
//						error = true;
						System.out.println(0);
						return;
					}
					while (true) {
						if(stack.isEmpty() || stack.peek() == '(') {
//							error = true;
							System.out.println(0);
							return;  // main 종료
						}
						if(stack.peek() == '[') break;
						result += stack.pop() - '0';
					}
					if (result == 0)
						result = 1;
					result *= 3;
					stack.pop(); // [ pop
					stack.push((char) (result + '0')); // 덧셈 결과 숫자로 넣어주기
					System.out.println("가장 top 숫자는 " + (stack.peek() - '0'));
					result = 0;
				}
			}
//		} 
		
//		if (error) {   
//			result = 0;
//		} else {
//			while(!stack.isEmpty()) {
//				result += stack.pop() - '0';
//			} // stack에 남아있는 결과값 pop
//
//			if (!stack.isEmpty()) { // stack이 비어있지 않다면
//				result = 0;
//			}
//		}
		
		while(!stack.isEmpty()) {
			if(stack.peek() == '(' || stack.peek() == '[') {
				System.out.println(0);
				return;
			}
			result += stack.pop() - '0';
		} // stack에 남아있는 결과값 pop
			
		System.out.println(result);
	}

	private static void print(char[] arr) {
		System.out.println(Arrays.toString(arr));
	}

}
