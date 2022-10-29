package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1110 {  // 더하기 사이클

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		int tmp = N;
		L : while(true) {
			if(tmp<10) {
				tmp = tmp*10 + 	tmp;
				cnt++;
				//System.out.println(cnt);
			}else {
				tmp = tmp%10*10 + (tmp/10+tmp%10)%10;
				cnt++;
				//System.out.println(cnt);
			}
			if(tmp == N) {
				break L;
			}
		}System.out.println(cnt);

	}

}
