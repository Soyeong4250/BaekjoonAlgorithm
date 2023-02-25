package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1149 { // RGB 거리

	public static void main(String[] args) throws NumberFormatException, IOException {
		Main1149 main = new Main1149();

		System.out.println(main.solution());
	}

	private int solution() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int answer = -1;
		
		char[] color = new char[n];
		int[] sum = new int[n];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int r = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(r <= g && r <= b) {
				color[i] = 'r';
				sum[i] = r;
			}else if(g <= r && g <= b) {
				color[i] = 'g';
				sum[i] = g;
			}else if(b <= r && b <= g) {
				color[i] = 'b';
				sum[i] = b;
			}
			
		}
		
		System.out.println(Arrays.toString(color));
		System.out.println(Arrays.toString(sum));
		
		return sum[n-1];
	}

}
