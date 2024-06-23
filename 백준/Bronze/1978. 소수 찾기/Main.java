import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        sc.close();

        for (int i: a) {
            if (isPrime(i)) {
                //System.out.println(i + " is Prime");
                cnt++;
            }
        }
        
        System.out.println(cnt);
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
