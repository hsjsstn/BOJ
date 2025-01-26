import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr.add(a);
            arr.add(b);
        }

        for (int i = 0; i < n; i++) {
            int a = arr.get(i*2);
            int b = arr.get(i*2+1);
            int d = disivor(a, b);
            
            System.out.println(a * b / d);
        }
    }

    public static int disivor(int m, int n) { // 최대공약수 구하기
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
