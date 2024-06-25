import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int cnt = 0;
        ArrayList<Integer> a = new ArrayList<>();

        while(n != 0) {
            n = sc.nextInt();

            for (int j = n+1; j < n * 2 + 1; j++) {
                if (isPrime(j)) {
                    //System.out.println("prime: " + j);
                    cnt++;
                }
            }
            a.add(cnt);
            cnt = 0;
        }
        sc.close();
        a.remove(a.size()-1);
        for (int i: a) {
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
