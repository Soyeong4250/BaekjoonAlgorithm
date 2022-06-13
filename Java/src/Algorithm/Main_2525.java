package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2525 {  // 오븐 시계

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int hour = Integer.parseInt(st.nextToken());
		int minutes = Integer.parseInt(st.nextToken());
		int time = Integer.parseInt(br.readLine());
		
		if(minutes+time >= 60) {
			hour += (minutes+time)/60;
			minutes = (minutes+time)%60;
		} else {
			minutes += time;
		}
		
		if(hour >= 24) {
			hour -= 24;
		}
		System.out.println(hour + " " + minutes);
	}

}
