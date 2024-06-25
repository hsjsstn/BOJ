import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        String[] sArr = s.split("");

        Arrays.sort(sArr, Collections.reverseOrder());

        for (String str : sArr) {
            System.out.print(str);
        }
    }
}
