package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main25332 {  // 수들의 합 8

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] a = new int[N];
		int[] b = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < b.length; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		HashMap<Integer, Integer> hashA = new HashMap<>();
		HashMap<Integer, Integer> hashB = new HashMap<>();
		
		int key = Combination(a, new boolean[N], 0, 0, 0);
		hashA.put(key, hashA.getOrDefault(key, 0)+1);
		
		key = Combination(b, new boolean[N], 0, 0, 0);
		hashB.put(key, hashB.getOrDefault(key, 0)+1);
		
		System.out.println(hashA);
		System.out.println(hashB);
	}

	private static int Combination(int[] a, boolean[] v, int idx, int select, int sum) {
		if(select == 3) {
			return sum;
		}
		
		if(idx == a.length) {
			return 0;
		}
		
		for (int i = idx; i < a.length; i++) {
			if(v[i] == false) {
				v[i] = true;
				Combination(a, v, idx+1, select+1, sum+=a[i]);
				v[i] = false;
			}
		}
		
		return sum;
	}

}
