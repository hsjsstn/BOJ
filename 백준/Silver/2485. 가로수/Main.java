import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // m: 분자, n: 분모
        int n = sc.nextInt();
        int k = 0;
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt()); 
        }
        for (int i = 0; i < n-1; i++) {
            k = disivor(a.get(i+1) - a.get(i), k);
            //System.out.println(k);
        }
        sc.close();

        int total = (a.get(a.size()-1) - a.get(0)) / k + 1 - n;
        
        System.out.println(total);
    }

    public static int disivor(int a, int b) {
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
         }
         if (b == 0) {
            return a;
         }
         return disivor(b, a % b);
    }
}
