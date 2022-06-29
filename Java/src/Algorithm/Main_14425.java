package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main_14425 {  // 문자열 집합

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashSet<String> hash = new HashSet<>();
		for (int i = 0; i < N; i++) {
			hash.add(br.readLine());
		}
		
		int result = 0;
		for (int i = 0; i < M; i++) {
			String str = br.readLine();
			if(hash.contains(str)) {
				result += 1;
			}
		}
		
		System.out.println(result);
	}

}
