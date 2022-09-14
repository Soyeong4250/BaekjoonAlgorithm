package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_4949 {  // 균형잡힌 세상

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		while((str = br.readLine()) != null) { 
			System.out.println(str);
			Stack<Character> stack = new Stack<>();
			
			StringTokenizer st = new StringTokenizer(str);
			
			while(st.hasMoreTokens()) {
				String word = st.toString();
				if(word.matches("[(|)|\\[|\\]]")) {
					char ch = word.charAt(0)
					if(ch == '[' || ch == '(') {
					stack.push(ch);
						System.out.println("들어갔다");
					}else {
						if(!stack.isEmpty() && stack.peek()=='['&& ch == ']') {
							stack.pop();
						}else if(!stack.isEmpty() && stack.peek()=='('&& ch == ')') {
							stack.pop();
						}else {
							stack.push(ch);
						}
					}
				}
				
			}
			
//			for (int i = 0; i < str.length()-1; i++) {  // 마지막 점 빼기
//				char ch = str.charAt(i);
//				System.out.println(ch);
//				if(ch != ' ' && ch < 'A' && 'Z' < ch && ch < 'a' && 'z' < ch) {  // 문자가 아닐 경우
//					if(ch == '[' || ch == '(') {
//						stack.push(ch);
//						System.out.println("들어갔다");
//					}else {
//						if(!stack.isEmpty() && stack.peek()=='['&& ch == ']') {
//							stack.pop();
//						}else if(!stack.isEmpty() && stack.peek()=='('&& ch == ')') {
//							stack.pop();
//						}else {
//							stack.push(ch);
//						}
//					}
//				}
//				System.out.println(stack);
//			}
			if(stack.isEmpty()) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}

}
