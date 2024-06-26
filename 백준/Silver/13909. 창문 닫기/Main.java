import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();

        // 창문이 열려있는 경우의 수는, 약수의 개수가 홀수인 경우
        // 약수의 개수가 홀수인 경우느 제곱수일 경우이다.
        // 1부터 n까지의 제곱수는 1, 4, 9, ..., k^2 <= n 인 모든 k
        int cnt = (int) Math.sqrt(n);
        
        System.out.println(cnt);
    }
}
