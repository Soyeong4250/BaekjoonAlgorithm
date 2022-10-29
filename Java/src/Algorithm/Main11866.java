package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main11866 {  // 요세푸스 문제 0

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> q = new LinkedList<>();
		List<Integer> list = new ArrayList<>();
		
		for (int i = 1; i <= N; i++) {
			q.add(i);  // q에 입력
		}
		
		int order = 1;  // 순서
		
		while(!q.isEmpty()) {
			if(order == K) {
				list.add(q.poll());  // K번째이면 q에서 빼기
				order = 0;
			}else {
				q.add(q.poll());  // q 가장 앞에 있는 수 빼서 뒤에 넣기
			}
			order++;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		for (int i = 0; i < list.size()-1; i++) {
			sb.append(list.get(i));
			sb.append(", ");
		}
		sb.append(list.get(list.size()-1) + ">");
		System.out.println(sb);
	}

}
