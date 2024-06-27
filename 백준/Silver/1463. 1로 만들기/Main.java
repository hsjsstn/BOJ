import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int[] memo = new int[n+1];
        // 최댓값으로 초기화
        for (int i = 0; i <= n; i++) {
            memo[i] = Integer.MAX_VALUE;
        }
        // 1의 경우, 연산은 0
        memo[1] = 0;
        // memo 배열에는 최소 연산 count 값을 저장
        for (int i = 2; i <= n; i++) {  
            memo[i] = memo[i-1] + 1; // +1의 경우
            if (i % 2 == 0) { // 2로 나누어 떨어지는 경우
                memo[i] = Math.min(memo[i], memo[i / 2] + 1); // +1의 경우와 *2의 경우 중 최소 연산 값 저장
            }
            if (i % 3 == 0) { // 3으로 나누어 떨어지는 경우
                memo[i] = Math.min(memo[i], memo[i / 3] + 1); // +1의 경우와 *3의 경우 중 최소 연산 값 저장
            }
            
        }

        System.out.println(memo[n]);
    }

}