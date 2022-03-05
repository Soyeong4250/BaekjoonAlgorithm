package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10799 { // 쇠막대기

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		
//		char[] arr = new char[str.length()];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = str.charAt(i);
//		}
		
		char[] arr = str.toCharArray();

		/*int result = 0;  // 결과
		int cnt = 0;  // 현재 쇠막대기 개수
		boolean cut = false;
		
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] == '(' && arr[i+1] == ')') {  // 레이저인 경우
				cut = true;   // 레이저임을 표시
				System.out.println("레이저 " + arr[i]);  // 확인
			} else if(arr[i] == '(' && arr[i+1] == '(') {  // 현재 시작되는 (가 쇠막대기인 경우
				cnt += 1;
				System.out.println("쇠막대기 " + cnt);  // 확인
			} else if(arr[i] == ')') {
				if(cut == true) {  // )가 레이저의 )일 경우
					result += cnt;
					cut = false;
					System.out.println("레이저 " + result + " , " + cnt);  // 확인
				}else {  // )가 쇠막대기의 )일 경우
					result += 1;
					cnt -= 1;
					System.out.println("쇠막대기 " + result + ", " + cnt);  // 확인
				}
			}
		}
		
		result += 1;  // 마지막 쇠막대기 끝

		System.out.println(result);*/
		
		int result = 0;  // 결과
		int cnt = 0;  // 현재 쇠막대기 개수
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == '(') {
				cnt += 1;  
			} else {
				if(arr[i-1] == '(') {  // 레이저인 경우
					cnt -= 1;
					result += cnt;
				} else {
					result += 1;  // 쇠막대기 1개 끝
					cnt -= 1;
				}
			}
		}
		
		System.out.println(result);
		
	}

}
