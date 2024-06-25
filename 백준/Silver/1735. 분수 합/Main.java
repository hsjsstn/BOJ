import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // m: 분자, n: 분모
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        int m2 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();

        int newM = m1 * n2 + m2 * n1;
        int newN = n1 * n2;

        int d = disivor(newM, newN);

        newM /= d;
        newN /= d;

        System.out.println(newM + " " + newN);
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
