import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int a = disivor(m, n);
        int b = m * n / a;

        System.out.println(a);
        System.out.println(b);
    }
    public static int disivor(int m, int n) {
        int a, b, r = 1;
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
