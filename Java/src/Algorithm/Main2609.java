package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2609 {  // 최대공약수와 최소공배수

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int small = Math.min(a, b);
		int big = Math.max(a, b);
		
		int gc = 1;
		int lc = 1;
		while(small > 0) {
			int tmp = big%small;
			big = small;
			small = tmp;
		}
		gc = big;
		lc = a*b/gc;
		
		System.out.println(gc);
		System.out.println(lc);
	}

}
