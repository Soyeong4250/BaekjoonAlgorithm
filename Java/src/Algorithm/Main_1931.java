package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1931 {  // 회의실 배정

	static class Meeting implements Comparable<Meeting>{
		int start, end;
		
		// 생성자
		public Meeting(int start, int end) {
			super();
			this.start = start;
			this.end = end;
		}

		// 종료시간 기준으로 오름차순을 하기 위한 Arrays.sort()를 활용하기 위해 compareTo 정의
		@Override
		public int compareTo(Meeting o) {
			
			int val =  this.end - o.end;
			
			if(val != 0) {  // 현재 회의 종료시간과 비교하고자 하는 회의의 종료시간이 다르다면
				return val;  // val 그대로 반환 (종료 시간이 빠른 순으로)
			}
			
			// 현재 회의 종료시간과 비교하고자 하는 회의의 종료시간이 같다면 시작시간이 빠른 순으로 정렬
			return this.start - o.start;  // 시작시간이 빠른 순으로 정렬
		}

		// 결과 확인을 위한 toString()
		@Override
		public String toString() {
			return "Meeting [start=" + start + ", end=" + end + "]";
		}
		
	}
	
	static int cnt = 0;  // 회의 개수
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력
		int N = Integer.parseInt(br.readLine());  // 회의의 수
		
		Meeting[] meetings = new Meeting[N];
		for (int i = 0; i < meetings.length; i++) {  // 각 회의의 시작시간과 종료시간
			StringTokenizer st = new StringTokenizer(br.readLine());
			meetings[i] = new Meeting(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		// 결과 확인
//		for(Meeting meeting : getSchedule(meetings)) {
//			System.out.println(meeting);
//		};
		getSchedule(meetings);
		System.out.println(cnt);
	}
	
	static ArrayList<Meeting> getSchedule(Meeting[] meetings){
		 ArrayList<Meeting> list = new ArrayList<Meeting>();
		 
		 Arrays.sort(meetings);  // 종료시간 기준 오름차순 정렬
		 list.add(meetings[0]);  // 첫 회의 추가
		 cnt += 1;
		 
		 for (int i = 1; i < meetings.length; i++) {
			 // list의 가장 마지막 원소(회의)의 종료시간보다 meetings배열의 i번째 회의의 시작시간이 더 늦다면 list에 추가
			if(list.get(list.size()-1).end <= meetings[i].start){
				list.add(meetings[i]);
				cnt++;
			}
		}
		 return list;
	}

}
