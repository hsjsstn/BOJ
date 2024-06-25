import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long k = disivor(a, b);
        sc.close();

        // 유클리드 호제법을 이용하여 최소공배수 구하기
        System.out.println(a * b / k);
    }

    public static long disivor(long m, long n) {
        long a, b, r = 1;
        if (m > n) {
            a = m;
            b = n;
        } else {
            a = n;
            b = m;
        }
        // 최대 공약수가 자기 자신인 경우 자신을 return
        if (m % n == 0) {
            return n;
        }
        else if (n % m == 0) {
            return m;
        }  

        // 최소공약수 구하기 (유클리드 호제법)
        while(r > 0) {
            r = a % b;
            a = b;
            b = r;
        }
        
        return a;
    }
}
