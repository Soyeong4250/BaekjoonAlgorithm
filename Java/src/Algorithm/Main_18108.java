package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_18108 {  // 1998년생인 내가 태국에서는 2541년생?!

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int y = Integer.parseInt(br.readLine());
		
		System.out.println(y-543);
	}

}
