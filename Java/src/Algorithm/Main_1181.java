package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main_1181 {  // 단어 정렬

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] dict = new String[N];
		
		for (int i = 0; i < N; i++) {
			dict[i] = br.readLine();
		}
		
		Arrays.sort(dict, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					for (int i = 0; i < o1.length(); i++) {
						if(o1.charAt(i) > o2.charAt(i)) {
							return 1;
						}else if(o1.charAt(i) < o2.charAt(i)) {
							return -1;
						}
					}
				}
				return o1.length() - o2.length();  // 길이가 짧은 것부터
			}
			
		});
		
		System.out.println(Arrays.toString(dict));
		List<String> result = new ArrayList<>();
		for (int i = 0; i < dict.length; i++) {
			if(0 < i && dict[i-1].equals(dict[i])) {
				continue;
			}
			result.add(dict[i]);
		}
		
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}

}
