package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_12891 { // DNA 비밀번호

	static String[] str;
	static int[] check;
	static int[] myStr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int s = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int cnt = 0;
		
		str = br.readLine().split("");
		check = new int[4];  // A, C, G, T
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < check.length; i++) {
			check[i] = Integer.parseInt(st.nextToken());
		}
		myStr = new int[4];
	
		for (int i = 0; i < p; i++) {
			Add(str[i]);
		}
		if(isCheck()) cnt++;
		System.out.println(cnt + "만족");
		
		for (int i = p; i < s; i++) {
			System.out.println(str[i] + "삽입");
			Add(str[i]);
			Remove(str[i-p]);
			System.out.println(str[i-p] + "제거");
			if(isCheck()) cnt++;
		}
		
		System.out.println(cnt);

	}

	private static boolean isCheck() {
		for (int i = 0; i < check.length; i++) {
			if(myStr[i] < check[i]) {
				return false;
			}
		}
		
		return true;
	}

	private static void Remove(String s) {
		if(s.equals("A")) {
			myStr[0]--;
		} else if(s.equals("C")) {
			myStr[1]--;
		} else if(s.equals("G")) {
			myStr[2]--;
		} else if(s.equals("T")) {
			myStr[3]--;
		}
	}

	private static void Add(String s) {
		if(s.equals("A")) {
			myStr[0]++;
		} else if(s.equals("C")) {
			myStr[1]++;
		} else if(s.equals("G")) {
			myStr[2]++;
		} else if(s.equals("T")) {
			myStr[3]++;
		}
	}

}
