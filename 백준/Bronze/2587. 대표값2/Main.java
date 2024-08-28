import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int sum = 0;
        
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
            sum += num[i];
        }

        sort(num);

        System.out.println(sum / 5);
        System.out.println(num[2]);
    }

    public static void sort(int[] num) {
        for (int i = 0; i < 4; i++) {
            if (num[i] > num[i+1]) {
                int tmp = num[i];
                num[i] = num[i+1];
                num[i+1] = tmp;
                i = 0;
            }
        }
    }
}
