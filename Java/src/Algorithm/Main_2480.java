package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main_2480 {  // 주사위 세개

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashMap<Integer, Integer> hash = new HashMap();
		int max = 0;
		while(st.hasMoreTokens()) {
			int key = Integer.parseInt(st.nextToken());
			hash.put(key, hash.getOrDefault(key, 0)+1);
			if(max < key) {
				max = key;
			}
		}
		List<Entry<Integer, Integer>> list_entries = new ArrayList<Entry<Integer, Integer>>(hash.entrySet());
		Collections.sort(list_entries, new Comparator<Entry<Integer, Integer>>(){

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
//		 System.out.println(hash);
		
		int sum = 0;
		for(int key : hash.keySet()) {
			if(hash.get(key) == 3) {
				sum = 10000 + key * 1000;
				break;
			}else if(hash.get(key) == 2) {
				sum = 1000 + key * 100;
				break;
			}else {
				sum = max * 100;
				break;
			}
		}
		
		System.out.println(sum);
	}

}
