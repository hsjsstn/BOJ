import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Long> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long t = sc.nextLong();

            while (!isPrime(t)) {
                t++;
            }
            a.add(t);
        }
        sc.close();
        for (long i: a) {
            System.out.println(i);
        }

    }

    public static boolean isPrime(long n) {
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
