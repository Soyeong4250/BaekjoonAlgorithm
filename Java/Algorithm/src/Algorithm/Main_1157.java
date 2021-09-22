package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// System.out.println((int)'a');  // 127
		// System.out.println((int)'A');  // 65
		// System.out.println((int)'z');  // 122
		// System.out.println((int)'Z');  // 90

		int max = -1;
		int idx = -1;
		int cnt = 0;
		String str = br.readLine();
		int[] alphabet = new int[27];
		for (int i = 0; i < str.length(); i++) {
			if('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
				alphabet[str.charAt(i)-'A']++;
			}
			else {
				alphabet[str.charAt(i)-'a']++;
			}
		}
		// print(alphabet);  // 확인
		
		// 최대값 구하기
		for (int i = 0; i < alphabet.length; i++) {
			if(max < alphabet[i]) {
				max = alphabet[i];
				idx = i;
				cnt = 1;
			}else if(max == alphabet[i]) {
				cnt++;
			}
		}
		
		if(cnt >= 2) {
			System.out.println("?");
		}else {
			System.out.println((char)(idx+65));
		}
		
	}

	private static void print(int[] alphabet) {
		for (int i = 0; i < alphabet.length; i++) {
			System.out.print(alphabet[i] + " ");
		}System.out.println();
	}

}
