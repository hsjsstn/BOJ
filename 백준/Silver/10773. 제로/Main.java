import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        
        int n = sc.nextInt();
        int cnt = 0;
        
        for (int i = 0; i < n; i++) {
            int command = sc.nextInt();
            
            if (command == 0) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(command);
            }
        }
        while (!stack.isEmpty()) {
            cnt += stack.pop();
        }

        System.out.println(cnt);
        sc.close();
    }
}
