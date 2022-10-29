package Algorithm;

import java.util.Scanner;

public class Main2748 {  // 피보나치 수 2
    public static void main(String[] args) {
        Main2748 main = new Main2748();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(main.solution(n));
    }
    
    public long solution(int n) {
        long[] memo = new long[n+1];
        
        memo[0] = 0;
        memo[1] = 1;
        
        for(int i = 2; i <= n; i++) {
            memo[i] = memo[i-1] + memo[i-2];
        }
        
        return memo[n];
    }
}