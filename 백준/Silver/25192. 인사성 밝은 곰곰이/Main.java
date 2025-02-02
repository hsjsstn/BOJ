import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> a = new HashSet<>();  

        int n = sc.nextInt();
        int cnt = 0;

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if (s.equals("ENTER")) { 
                a.clear(); // Set 초기화
            }
            else {
                if (a.add(s)) { 
                    cnt += 1;
                }
            }
        }

        System.out.println(cnt);
    }
}