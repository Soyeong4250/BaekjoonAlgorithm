package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2504 {  // 괄호의 값

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int result = 0;  // 제출할 답
		int tmp = 1;  // 임시로 저장할 변수
		int s = 0;  // () 쌍을 맞추기 위한 변수
		int b = 0;  // [] 쌍을 맞추기 위한 변수
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(') {
				s++;
				tmp *= 2;
			}else if(str.charAt(i) == '[') {
				b++;
				tmp *= 3;
			}else if(str.charAt(i) == ')') {
				s--;
				if(i-1 >= 0 && str.charAt(i-1) == '[') {
					result = 0;
					break;
				} else if(i-1 >= 0 && str.charAt(i-1) == '(') {
					result += tmp;
					tmp /= 2;
				} else {
					tmp /= 2;
				}
			} else {
				b--;
				if(i-1 >= 0 && str.charAt(i-1) == '(') {
					result = 0;
					break;
				} else if(i-1 >= 0 && str.charAt(i-1) == '[') {
					result += tmp;
					tmp /= 3;
				} else {
					tmp /= 3;
				}
			}
		}

		if(s != 0 || b != 0) {  // ([[[()]]))
			result = 0;
		}
		
		System.out.println(result);
	}

}
