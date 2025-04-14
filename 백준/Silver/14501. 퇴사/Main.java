import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();  // 총 날짜 수
        int[] T = new int[N];  // 상담 기간
        int[] P = new int[N];  // 상담 금액
        int[] dp = new int[N + 1];  // 최대 수익 저장용 (dp[N] = 0으로 초기화)

        for (int i = 0; i < N; i++) {
            T[i] = sc.nextInt();
            P[i] = sc.nextInt();
        }

        for (int i = N - 1; i >= 0; i--) {
            if (i + T[i] <= N) {
                dp[i] = Math.max(P[i] + dp[i + T[i]], dp[i + 1]);
            } else {
                dp[i] = dp[i + 1];
            }
        }

        System.out.println(dp[0]);
    }
}