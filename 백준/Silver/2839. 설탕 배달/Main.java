import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int min = -1;
        int count = 0;
        sc.close();

        // 5의 배수를 만들기 위해 3을 더한다.
        for (int i = 0; i < n; i++) {
            // 합이 넘어가면 break, -1 출력
            if (sum > n) {
                break;
            }
            // 그 외 경우 min에 count 대입
            else if (sum == n) {
                min = count;
                break;
            }
            // 5의 배수일 경우 break
            if ((n - sum) % 5 == 0) {
                min = count + (n - sum) / 5;
                break;
            }
        
            sum += 3;
            count++;
        }

        System.out.println(min);
    }    
}
