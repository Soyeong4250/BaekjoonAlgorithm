package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main3986 {  // 좋은 단어

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			Stack<Character> stack = new Stack<>();
			
			if(str.length()%2 != 0) {  // 문자열이 홀수면 좋은 단어x
				continue;
			}
			
			for (int j = 0; j < str.length(); j++) {
				if(stack.isEmpty()) {
					stack.push(str.charAt(j));
				}else {
					if(stack.peek() != str.charAt(j)) { // stack의 top과 다르다면
						stack.push(str.charAt(j));
					}else {
						stack.pop();
					}
				}
			}
			
			// 확인
			// System.out.println("stack상태는 " + stack);
			
			if(stack.isEmpty()) {
				cnt += 1;
			}
			
		}
		
		System.out.println(cnt);

	}

}
