package Algorithm;

/* Date: 2024-02-18
   Site: Baekjoon
 */

import java.io.*;
import java.util.*;


public class Main1260_R {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        ArrayList<Integer>[] adj = new ArrayList[N+1];
        for (int i = 0; i < N+1; i++) {
            adj[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int aSpot = Integer.parseInt(st.nextToken());
            int bSpot = Integer.parseInt(st.nextToken());
            adj[aSpot].add(bSpot);
            adj[bSpot].add(aSpot);
        }

        for (int i = 0; i < adj.length; i++) {
            adj[i].sort(Comparator.naturalOrder());
        }

        StringBuilder dfsAnswer = new StringBuilder();
        bw.write(dfs(adj, new boolean[N+1], V, dfsAnswer) + "\n");
        bw.write(bfs(adj, new boolean[N+1], V));
        bw.flush();
        bw.close();
        br.close();
    }

    private static String dfs(ArrayList<Integer>[] adj, boolean[] visit, int start, StringBuilder dfsAnswer) {
        visit[start] = true;
        dfsAnswer.append(start).append(" ");
        for (int i = 0; i < adj[start].size(); i++) {
            int spot = adj[start].get(i);
            if(!visit[spot]) dfs(adj, visit, spot, dfsAnswer);
        }

        return dfsAnswer.toString().trim();
    }

    private static String bfs(ArrayList<Integer>[] adj, boolean[] visit, int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visit[start] = true;

        StringBuilder answer = new StringBuilder();
        while(!q.isEmpty()) {
            int from = q.poll();
            answer.append(from).append(" ");
            for (int i = 0; i < adj[from].size(); i++) {
                int spot = adj[from].get(i);
                if(!visit[spot]) {
                    q.add(spot);
                    visit[spot] = true;
                }
            }
        }

        return answer.toString().trim();
    }
}
