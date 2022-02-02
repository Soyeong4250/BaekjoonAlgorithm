package Algorithm;

import java.util.Scanner;

public class Main_10952 {  // A+B-4

	public static void main(String[] args) {  // A + B - 5
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A==0 && B==0) {
				break;
			}else {
				System.out.println(A+B);
			}
		}
	}
}
