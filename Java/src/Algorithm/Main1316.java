package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main1316 {  // 그룹 단어 체커

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		for (int i = 0; i < N; i++) {
			boolean[] alphabet = new boolean[26];
			String word = br.readLine();
			boolean check = true;
			for (int j = 0; j < word.length(); j++) {
				char ch = word.charAt(j);
				if(j > 0 && ch!= word.charAt(j-1) && alphabet[(int)ch - 97]) {
					check = false;
					break;
				}
				alphabet[(int)ch - 97] = true;
			}
			
			if(check) {
//				System.out.println(word);
				result++;
			}
			
		}
		
		System.out.println(result);
		
	}

}
