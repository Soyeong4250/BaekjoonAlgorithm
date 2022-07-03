package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main_25330 {  // SHOW ME THE DUNGEON
	static class Village {
		int monster;
		int people;
		
		public Village(int moster, int people) {
			this.monster = moster;
			this.people = people;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		Village[] v = new Village[N];
		for (int i = 0; i < v.length; i++) {
			v[i] = new Village(Integer.parseInt(st.nextToken()), 0);
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < v.length; i++) {
			v[i].people = Integer.parseInt(st.nextToken());
		}
		
		// people / monster 내림차순 정렬
		Arrays.sort(v, new Comparator<Village>() {

			@Override
			public int compare(Village o1, Village o2) {
				return o1.monster - o2.monster;
			}
		});
		
//		for (int i = 0; i < v.length; i++) {
//			System.out.println(v[i].monster + " " + v[i].people);
//		}
		int result = 0;
		int sum = 0;
		for (int i = 0; i < v.length; i++) {
			if(0 <= K - (sum+v[i].monster)) {
				sum += v[i].monster;
				K -= sum;
				result += v[i].people;
			} else {
				break;
			}
		}
		
		System.out.println(result);
	}

}
