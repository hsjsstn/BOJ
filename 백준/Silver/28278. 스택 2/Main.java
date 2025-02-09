import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            switch (command) {
                case 1: // push X
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case 2: // pop
                    sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
                    break;
                case 3: // count
                    sb.append(stack.size()).append("\n");
                    break;
                case 4: // isEmpty
                    sb.append(stack.isEmpty() ? 1 : 0).append("\n");
                    break;
                case 5: // peek
                    sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
                    break;
            }
        }

        System.out.print(sb.toString());
        br.close();
    }
}