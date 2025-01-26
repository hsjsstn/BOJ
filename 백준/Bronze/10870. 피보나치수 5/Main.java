import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        int n = sc.nextInt();
        while (a.size() <= n) {
            a.add(null); 
        }

        a = Fibo(n, a);
        System.out.println(a.get(n));
    }

    public static ArrayList<Integer> Fibo(int n, ArrayList<Integer> a) {
        if (n == 0) {
            a.set(0, 0); 
        } 
        else if (n == 1) {
            a.set(1, 1);
        } 
        else if (a.get(n) == null) {
            if (a.get(n - 1) == null) {
                a = Fibo(n - 1, a);
            }
            if (a.get(n - 2) == null) {
                a = Fibo(n - 2, a);
            }
            int t = a.get(n - 1) + a.get(n - 2);
            a.set(n, t); 
        }

        return a;
    }
}