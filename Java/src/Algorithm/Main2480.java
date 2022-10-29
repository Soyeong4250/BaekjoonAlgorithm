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

public class Main2480 {  // 주사위 세개

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<Integer, Integer> dice = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = -1;
		for (int i = 0; i < 3; i++) {
			int spot = Integer.parseInt(st.nextToken());
			if(spot > max) max = spot;
			dice.put(spot, dice.getOrDefault(spot, 0) + 1);
		}
		
		List<Entry<Integer, Integer>> dice_list = new ArrayList<Entry<Integer, Integer>>(dice.entrySet());
		Collections.sort(dice_list, new Comparator<Entry<Integer, Integer>>(){

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// 내림차순 정렬
				return o2.getValue().compareTo(o1.getValue());
			}			
		});
		
		if(dice_list.get(0).getValue() == 3) {
			System.out.println(10000 + dice_list.get(0).getKey() * 1000);
		}else if(dice_list.get(0).getValue() == 2) {
			System.out.println(1000 + dice_list.get(0).getKey() * 100);
		}else {
			System.out.println(max * 100);
		}
	}

}
