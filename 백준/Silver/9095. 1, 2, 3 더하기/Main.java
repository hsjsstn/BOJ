import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> picked = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            numbers.add(sc.nextInt());
        }


        for (int i : numbers) {
            for (int j = i; j > 0; j--) {
                pick(3, picked, i, j);
            }
            System.out.println(count);
            count = 0;
        }

        sc.close();
    }

     public static void pick(int n, ArrayList<Integer> picked, int m, int toPick) {
        int lastIndex, smallest;

        if (toPick == 0) {
            int sum = 0;

            for (int i : picked) {
                sum += i + 1;
                // System.out.print(i+1 + " ");
                if (sum > m) {
                    return;
                }
            }
            // System.out.println();
            // System.out.println("m: "+ m +" | sum: " + sum);
            if (sum == m) {
                count++;
                // System.out.println("!!!");
            }
                
            return;
        }

        lastIndex = m - toPick- 1;

        smallest = 0;

        for (int i = smallest; i < n; i++) {
            picked.add(i);
            pick(n, picked, m, toPick - 1);
            picked.remove(picked.size() - 1);
        }
    }
}
