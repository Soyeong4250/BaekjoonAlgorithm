package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main17478 { // 재귀함수가 뭔가요?

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		String underbar = "";
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		recursion(underbar, num);
	}

	private static void recursion(String underbar, int num) {
		if(num == 0) {
			System.out.println(underbar + "\"재귀함수가 뭔가요?\"\n" +
					underbar + "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n" +
					underbar + "라고 답변하였지.");
			return;
		}

		System.out.println(underbar + "\"재귀함수가 뭔가요?\"\n" +
				underbar + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n" +
				underbar + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n" +
				underbar + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
		recursion(underbar + "____", num-1);
		System.out.println(underbar + "라고 답변하였지.");
	}

}
