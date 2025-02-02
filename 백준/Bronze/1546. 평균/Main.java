import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Float> a = new ArrayList<>();

        int n = sc.nextInt();
        float max = -1;
        float sum = 0;

        for (int i = 0; i < n; i++) {
            a.add(sc.nextFloat());
            if (a.get(i) >= max) {
                max = a.get(i);
            }
        }

        for (int i = 0; i < n; i++) {
            sum += a.get(i) * 100 / max ;
        }

        sum /= n;
        System.out.println(sum);
    }
}