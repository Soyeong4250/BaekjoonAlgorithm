package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main_10815 { // 숫자 카드

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);

		int M = Integer.parseInt(br.readLine());
		int[] card = new int[M];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < card.length; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}

		int idx = M / 2;
		int[] result = new int[M];
		for (int i = 0; i < arr.length; i++) {
			while (true) {
				if (idx < 0 || M < idx) {
					break;
				}

				if (card[idx] < arr[i]) {
					idx++;
				} else if (card[idx] > arr[i]) {
					idx--;
				} else {
					result[idx] = 1;
				}
			}
		}

		System.out.println(Arrays.toString(result));
	}

}
