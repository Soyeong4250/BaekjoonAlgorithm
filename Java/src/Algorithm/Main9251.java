package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main9251 { // LCS

	public static void main(String[] args) throws IOException {
		Main9251 main = new Main9251();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		System.out.println(main.solution(str1, str2));
	}

	private int solution(String str1, String str2) {
		int[][] memo = new int[str2.length()+1][str1.length()+1];
		
		for (int i = 0; i < memo.length; i++) {
			Arrays.fill(memo[i], 0);
		}
//		print(memo);
		
		for (int i = 1; i < memo.length; i++) {
			for (int j = 1; j < memo[i].length; j++) {
				memo[i][j] = str2.charAt(i-1) == str1.charAt(j-1) ? memo[i-1][j-1] + 1 : Math.max(memo[i][j-1], memo[i-1][j]);
			}
//			System.out.println("--------------------");
//			print(memo);
		}
		
		return memo[str2.length()][str1.length()];
	}

	private void print(int[][] memo) {
		for (int i = 1; i < memo.length; i++) {
			for (int j = 1; j < memo[0].length; j++) {
				System.out.print(memo[i][j] + " ");
			}System.out.println();
		}
	}

}
