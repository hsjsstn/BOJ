import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int idx = sc.nextInt();
        int ans = disivor(n, idx);

        System.out.println(ans);
    }
    public static int disivor(int n, int idx) {
        int cnt = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
            if (cnt == idx) {
                return i;
            }
        }
        return 0;
    }

}
