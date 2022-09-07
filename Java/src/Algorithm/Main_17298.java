package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_17298 { // 오큰수

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringBuilder sb  = new StringBuilder();
		int[] result = new int[N];
		Arrays.fill(result, -1);
		
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			System.out.println(num);
			if(!stack.isEmpty()&&stack.peek()<nums) {
				System.out.println("들어왔습니다.");
				result[i-1] = num;
			} else if(!stack.isEmpty()){
				
			}
			stack.add(num);
			System.out.println("stack의 마지막은 " + stack.peek());
			System.out.println("stack에 " +num + " 추가");
		}
		System.out.println(Arrays.toString(result));
		
		sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			if(i < N-1 && result[i] == -1) {
				result[i] = result[i+1];
			} 
			sb.append(result[i] + " ");
		}
		
		System.out.println(sb.toString().trim());
	}

}
