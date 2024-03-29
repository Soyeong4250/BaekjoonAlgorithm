package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2908 {  // 상수

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();

		A = A.substring(2) + A.substring(1, 2) + A.substring(0, 1);
		
		B = B.substring(2) + B.substring(1, 2) + B.substring(0, 1);
		
		int a = Integer.parseInt(A);
		int b = Integer.parseInt(B);
		
		System.out.println(Math.max(a, b));
	}

}
