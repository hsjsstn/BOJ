import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            a.add(t);
            if (t > max) {
                max = a.get(i);
            }
            if (t < min) {
                min = a.get(i);
            }
        }
        sc.close();
        int ans = max * min;
        System.out.println(ans);
     }
}
