package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main_1316 {  // 그룹 단어 체커

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = N;
		for (int i = 0; i < N; i++) {
			cnt += check(br.readLine());
		}
		
	}

	private static int check(String s) {
		HashMap<String, Integer> hash = new HashMap<>();
		for (int i = 0; i < s.length()-1; i++) {
			String key = s.substring(i, i+1);
			if(i > 0 && !s.substring(i-1, i).equals(key) && hash.get(key) != 0) {
				return -1;
			}
			hash.put(key, hash.getOrDefault(key, 0) + 1);
			System.out.println(hash);
		}
		
		return 1;
	}

}
