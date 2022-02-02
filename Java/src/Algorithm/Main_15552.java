package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_15552 {  // 빠른 A+B 

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			bw.write(String.valueOf(sum)+"\n"); // 출력
			
			// bw.newLine();  // bw.write는 자동개행기능이 없기 때문에 개행을 해주어야하는 경우 \n을 통해 따로 처리
		}
		// br.close();
		bw.flush();  // 남아있는 데이터 모두 출력
		bw.close();  // 버퍼를 잡아놓았기 때문에 반드시 flush() / close()를 호출해주어야 함
	}
}
