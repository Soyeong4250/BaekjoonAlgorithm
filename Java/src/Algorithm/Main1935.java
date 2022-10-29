package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main1935 {  // 후위 표기식2

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String postfix = br.readLine();
		Stack<Double> stack = new Stack<>();
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		
		for (int i = 0; i < postfix.length(); i++) {
			char ch = postfix.charAt(i);
			if(ch == '+') {
				double number = stack.pop() + stack.pop();
				stack.push(number);
//				System.out.println(stack);
			}else if(ch == '-') {
				double first = stack.pop();
				double second = stack.pop();
				stack.push(second - first);
//				System.out.println(stack);
			}else if(ch == '*') {
				double number = stack.pop() * stack.pop();
				stack.push(number);
//				System.out.println(stack);
			}else if(ch == '/') {
				double first = stack.pop();
				double second = stack.pop();
				stack.push(second / first);
//				System.out.println(stack);
			}else {
				stack.push((double)(arr[(int)ch - 65]));
//				System.out.println(stack);
			}
		}
		
		String result = String.format("%.2f", stack.pop());
		
		System.out.println(result);
	}

}
