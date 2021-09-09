package Algorithm;

public class Main_4673 {  // 셀프 넘버

	public static void main(String[] args){
		int i = 1;
		boolean[] check = new boolean[10000];
		while(10000>i) {
			if(i/10 == 0) {
				check[i+i] = true;
			}else if(i/10 > 0) {
				int tmp = i;
				int idx = tmp;
				while(tmp > 0) {
					idx += tmp%10;
					tmp = tmp/10;
				}
				if(idx < 10000) {
					check[idx] = true;
				}
			}
			i++;
		}
		
		for (int j = 1; j < 10000; j++) {
			if(check[j] == false) {
				System.out.println(j);
			}
		}
	}

}
