package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
		int answer = 0;
		
		List<String> combList1 = new ArrayList<>();
//		List<String> combList2 = new ArrayList<>();
		
		// str1으로 나올 수 있는 문자열 조합 모두 구하기
		for(int i=str1.length(); i > 0; i--) {
			combList1 = combination(str1, i, 0, "", combList1);
		}
		// str2으로 나올 수 있는 문자열 조합 모두 구하기
		for(int i=str2.length(); i > 0; i--) {
//			if(isLcs(str2, i, 0, "", combList1)) {
//				answer = i;
//			}
			boolean flag = isLcs(str2, i, 0, "", combList1);
		}
		
//		for(String sub : combList1) {
//			if(combList2.contains(sub)) {
//				answer = sub.length();
//				break;
//			}
//		}
		
		return answer;
	}

	private List<String> combination(String str, int len, int idx, String result, List<String> combList) {
		if(result.length() == len) {
			combList.add(result);
			return combList;
		}
		
		if(idx == str.length()) {
			return combList;
		}
		
		for(int i=idx; i<str.length(); i++) {
			combination(str, len, i+1, result+str.charAt(i), combList);
		}
		return combList;
	}
	
	private boolean isLcs(String str, int len, int idx, String result, List<String> combList) {
		if(result.length() == len) {
			System.out.println(result);
			if(combList.contains(result)) {
				System.out.println("포함 = " + result);
				return true;
			}
			return false;
		}
		
		if(idx == str.length()) {
			return false;
		}
		
		for(int i=idx; i<str.length(); i++) {
			if(isLcs(str, len, i+1, result+str.charAt(i), combList)) {
				return true;
			}
//			isLcs(str, len, i+1, result+str.charAt(i), combList);
			return false;
		}
	
		return false;
	}

}
