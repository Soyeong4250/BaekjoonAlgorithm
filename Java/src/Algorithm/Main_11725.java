package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_11725 { // 트리의 부모 찾기

	static int[] parent;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 1. 노드 개수 입력
		int N = Integer.parseInt(br.readLine());

		ArrayList<Integer>[] tree = new ArrayList[N + 1];
		boolean[] v = new boolean[N + 1];
		parent = new int[N + 1];
		
		// 2. 트리 정보를 담을 ArrayList 생성
		for (int i = 0; i < N + 1; i++) {
			tree[i] = new ArrayList<>();

		}

		// 3. 트리 정보 저장하기
		for (int i = 1; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int node1 = Integer.parseInt(st.nextToken());
			int node2 = Integer.parseInt(st.nextToken());
			tree[node1].add(node2);
			tree[node2].add(node1);
		}

		dfs(tree, v, 1); // 4. 부모 노드부터 탐색 시작
		
		for (int i = 2; i <= N; i++) {
			System.out.println(parent[i]);
		}
	}

	private static void dfs( ArrayList<Integer>[] tree, boolean[] v, int node) {
		v[node] = true;  // 5. 방문 처리
		for (int n : tree[node]) {  // 6. 해당 노드의 자식 노드 탐색
			if(!v[n]) {  // 7. 방문하지 않은 노드라면 자식 노드이므로
				parent[n] = node;  // 7. 현재 자식 노드의 인덱스에 부모 노드 값 저장
				dfs(tree, v, n);  // 8. 현재 자식 노드를 부모로 가진 자식 노드 탐색하기 위해 재귀
			}
		}
	}

}
