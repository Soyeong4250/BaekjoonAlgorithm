package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main10814 {  // 나이순 정렬

	static class Member {
		int age;
		String name;
		
		public Member(int age, String name) {
			this.age = age;
			this.name = name;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Member[] member = new Member[N];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			member[i] = new Member(Integer.parseInt(st.nextToken()), st.nextToken());
		}
		
		Arrays.sort(member, new Comparator<Member>() {

			@Override
			public int compare(Member o1, Member o2) {
				return o1.age - o2.age;
			}
		});
		
		for (int i = 0; i < member.length; i++) {
			System.out.println(member[i].age + " " + member[i].name);
		}
	}

}
