package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main11047 {  // 동전 0

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		List<Integer> coin = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			coin.add(Integer.parseInt(br.readLine()));
		}

		int sum = 0;
		for (int i = N-1; i >= 0; i--) {
			sum += K/coin.get(i);
			K %= coin.get(i);
		}
		
		System.out.println(sum);
	}

}
