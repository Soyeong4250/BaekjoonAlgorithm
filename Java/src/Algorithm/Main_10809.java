package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_10809 {  // 알파벳 찾기

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		int[] alphabet = new int[26];
		Arrays.fill(alphabet, -1);
		
		for (int i = 0; i < S.length(); i++) {
			if(alphabet[S.charAt(i)-97] == -1) {
				alphabet[S.charAt(i)-97]= i;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < alphabet.length; i++) {
			sb.append(alphabet[i] + " ");
		}
		
		System.out.println(sb.toString().trim());  // 마지막 공백 지우
	}

}
