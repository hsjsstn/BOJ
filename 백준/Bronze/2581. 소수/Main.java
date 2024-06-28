import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int min = n;
        int sum = 0;
        sc.close();

        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
                if (min > i) {
                    min = i;
                }
            }
        }
        if (sum == 0) {
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
    public static boolean isPrime(int n) {
        if (n == 1) // 1의 경우 소수X
            return false; 
        if (n == 2) // 2의 경우 소수
            return true;
        if (n % 2 == 0) // 짝수의 경우 소수X
            return false; 

        for (int i = 3; i <= Math.sqrt(n); i += 2) { // 홀수만 검사
            if (n % i == 0)
                return false; // 소수 아닌 경우
        }

        return true; // 소수인 경우
    }
    
}
