package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1193 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		int numerator = 1;
		int denominator = 1;
		
		int[] ndir = {-1, 1};
		int[] ddir = {1, -1};
		
		if(X == 1) {
			System.out.println("1/1");
			return;
		}
		
		int d = 0;
		for (int i = X-2; i >= 0; i--) {
			if(d == 1 && numerator == 1) {
				denominator += 1;
				d = 0;
				continue;
			}
			
			if(d == 0 && denominator == 1) {
				numerator += 1;
				d = 1;
				continue;
			}
			
			denominator += ndir[d];
			numerator += ddir[d];
		}
		
		System.out.println(numerator + "/" + denominator);
	}

}
