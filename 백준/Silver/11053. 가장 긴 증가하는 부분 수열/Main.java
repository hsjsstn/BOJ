import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 숫자 개수
        int[] arr = new int[n]; // 입력 숫자 
        int[] dp = new int[n]; // LIS 길이 (각 숫자를 끝으로 하는 최장 길이)

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            dp[i] = 1; // 최소 길이
        }

        int maxLIS = 1; // 가장 긴 수열 길이

        for (int i = 0; i < n; i++) { // 현재 숫자
            for (int j = 0; j < i; j++) { // 앞에 있는 숫자들 확인
                if (arr[j] < arr[i]) { // 앞 숫자가 더 작으면 이어짐
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLIS = Math.max(maxLIS, dp[i]); // 가장 긴 길이 저장
        }

        System.out.println(maxLIS); 
    }
}