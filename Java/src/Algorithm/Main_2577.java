package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2577 {  // 숫자의 개수 

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		String result = Integer.toString(A*B*C);
		int[] num = new int[10];
		
		/*for (int i = 0; i < result.length(); i++) {
			System.out.println(result.charAt(i));
		}*/
		
		for (int i = 0; i < result.length(); i++) {
			num[result.charAt(i)-'0']++;	
		}
		
		for (int j = 0; j < num.length; j++) {
			System.out.println(num[j]);
		}
	}
}
