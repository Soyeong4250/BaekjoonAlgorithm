package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11653 {  // 소인수분해

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int num = 2;
		while(N != 1) {
			if(N%num == 0) {
				System.out.println(num);
				N /= num;
			} else {
				num++;
			}
		}
	}

}