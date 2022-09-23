package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_1068 {  // 트리
	static ArrayList<Integer>[] tree;
	static boolean[] v;
	static int answer = 0;
	static int del = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		tree = new ArrayList[N];
		v = new boolean[N];
		int root = 0;
		
		for (int i = 0; i < tree.length; i++) {
			tree[i] = new ArrayList<>();
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int parent = Integer.parseInt(st.nextToken());
			if(parent == -1) {
				root = i;
			} else {
				tree[i].add(parent);
				tree[parent].add(i);
			}
		}
		
		del = Integer.parseInt(br.readLine());
		if(del == root) {
			System.out.println(0);
		} else {
			dfs(root);
			System.out.println(answer);
		}
	}
	
	private static void dfs(int node) {
		v[node] = true;
		int child = 0;
		for (int i : tree[node]) {
			if(!v[i] && del != i) {
				child++;
				dfs(i);
			}
		}
		if(child == 0) {
			answer++;
		}
	}

}
