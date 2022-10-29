package Algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Main1874 {  // 스택 수열

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Stack<Integer>stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int num = 1;
		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();
			while(num <= t) {
				stack.push(num);
				sb.append("+ \n");
				num++;
			}
			
			if(stack.peek() == t) {
				stack.pop();
				sb.append("- \n");
			}
		}
		
		if(stack.isEmpty()) {
			System.out.println(sb.toString());
		}else {
			System.out.println("NO");
		}
	}

}
	