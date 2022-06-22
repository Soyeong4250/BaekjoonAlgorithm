package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main_7568 {  // 덩치

	static class People {
		int weight;
		int tall;
		public People(int weight, int tall) {
			super();
			this.weight = weight;
			this.tall = tall;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		List<People> list = new ArrayList<>();
		int[] weights = new int[N];
		int[] talls = new int[N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int w = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());
			list.add(new People(w, t));
			weights[i] = w;
			talls[i] = t;
		}
		
		
		
	
	}

}
