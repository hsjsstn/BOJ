import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int rowDiff = Math.abs((a - 1) % 4 - (b - 1) % 4);
        int colDiff = Math.abs((a - 1) / 4 - (b - 1) / 4);

        System.out.println(rowDiff + colDiff);
    }
}