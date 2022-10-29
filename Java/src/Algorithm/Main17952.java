package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main17952 {  // 과제는 끝나지 않아!
	static class Homework {
		int score;
		int time;
		
		public Homework(int score, int time) {
			super();
			this.score = score;
			this.time = time;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			if(Integer.parseInt(st.nextToken()) == 1) {
				List<Homework> list = new ArrayList<>();
				Homework h = new Homework(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
				
			}
			
		}
	}

}
	