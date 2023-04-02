package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1717 { // 집합의 표현

	public static void main(String[] args) throws IOException {
		Main1717 main = new Main1717();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String nm = "7 8";
		String[] sign = { "0 1 3", "1 1 7", "0 7 6", "1 7 1", "0 3 7", "0 4 2", "0 1 1", "1 1 1" };
//		String nm = "1000000 8";
//		String[] sign = { "0 1 300000", "1 1 7", "0 7 6", "1 7 100", "0 300000 7", "0 4000 2", "0 1 1", "1 100 1" };
//		String nm = "7 4";
//		String[] sign = { "0 1 3", "0 7 6", "0 3 6", "1 7 6"};

		StringTokenizer st = new StringTokenizer(nm);
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] operation = new int[m][3];
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(sign[i]);
			for (int j = 0; j < 3; j++) {
				operation[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		System.out.println(main.solution(n, operation));
	}

	private String solution(int n, int[][] operation) {
		StringBuilder answer = new StringBuilder();
		
		// 1. 부모를 입력할 부모 배열 생성
		int[] parent = new int[n+1];
		
		// 2. 자기 자신을 부모로 하기
		for (int i = 0; i < n+1; i++) {
			parent[i] = i;
		}
		
		for (int i = 0; i < operation.length; i++) {
			int first = operation[i][1];
			int second = operation[i][2];
			
			// 3. 합치기
			if(operation[i][0] == 0) {
				parent = union(operation, parent, i);
			} else { // 4. 부모가 같은지 확인
				if(findParent(parent, first) == findParent(parent, second)) {
					answer.append("YES");
				} else {
					answer.append("NO");
				}
				answer.append("\n");
			}
			System.out.println(Arrays.toString(parent));
		}
		
		return answer.toString();
	}

	private int[] union(int[][] operation, int[] parent, int idx) {
		int parentA = findParent(parent, operation[idx][1]);
		int parentB = findParent(parent, operation[idx][2]);
		
		if(parentA < parentB) parent[parentB] = parentA;
		else parent[parentA] = parentB;
		
		return parent;
	}

	private int findParent(int[] parent, int idx) {
		if(parent[idx] == idx) return idx;
		return parent[idx] = findParent(parent, parent[idx]);
	}

}
