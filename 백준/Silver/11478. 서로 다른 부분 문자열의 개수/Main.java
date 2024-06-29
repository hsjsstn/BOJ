import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // ArrayList보다 HashSet이 더 빠르다! (O(n³) -> O(1))
        HashSet<String> set = new HashSet<>();
        int cnt = 0;
        sc.close();

        for (int i = 0; i <= str.length(); i++) {
            for (int j = i; j <= str.length(); j++) {
                String tmp = str.substring(i, j);
                
                if (!set.contains(tmp)) {
                   // System.out.println(tmp);

                    set.add(tmp);
                    cnt++;
                }
            }
        }

        System.out.println(cnt-1);
    }
}
