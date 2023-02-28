package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1149 { // RGB 거리

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[][] home = new int[n][3];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int r = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			if (i == 0) {
				home[i][0] = r;
				home[i][1] = g;
				home[i][2] = b;
			} else {
				home[i][0] = Math.min(home[i - 1][1], home[i - 1][2]) + r;
				home[i][1] = Math.min(home[i - 1][0], home[i - 1][2]) + g;
				home[i][2] = Math.min(home[i - 1][0], home[i - 1][1]) + b;
			}
		}
		
		for (int i = 0; i < home.length; i++) {
			System.out.println(Arrays.toString(home[i]));
		}
		
		System.out.println(Math.min(home[n-1][0], Math.min(home[n-1][1], home[n-1][2])));
	}
}
