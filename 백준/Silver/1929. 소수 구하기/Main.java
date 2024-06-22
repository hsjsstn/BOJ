import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1 || n == 2) // 1, 2의 경우
            return false; // 짝수의 경우 
        if (n % 2 == 0) 
            return false; 

        for (int i = 3; i <= Math.sqrt(n); i += 2) { // 홀수만 검사
            if (n % i == 0)
                return false; // 소수 아닌 경우
        }

        return true; // 소수인 경우
    }
}
