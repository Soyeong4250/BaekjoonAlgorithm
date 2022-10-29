package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main3003{
    public void solution(String input) {
        int[] chess = {1, 1, 2, 2, 2, 8};
        StringTokenizer st = new StringTokenizer(input);
        for (int i = 0; i < chess.length; i++) {
			System.out.printf("%d ", chess[i]-Integer.parseInt(st.nextToken()));
		}
    }
    
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        Main3003 main = new Main3003();
        main.solution(input);
    }
}