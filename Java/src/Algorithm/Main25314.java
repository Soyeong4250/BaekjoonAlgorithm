package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main25314 {  //코딩은 체육과목 입니다

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		sb.append("long int");
		N -= 4;
		while(N > 0) {
			sb.insert(0, "long ");
			N -= 4;
		}
		
		System.out.println(sb);
	}
}
