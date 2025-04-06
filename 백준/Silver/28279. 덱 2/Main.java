import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String command = br.readLine();

            if (command.startsWith("1 ")) {
                int x = Integer.parseInt(command.split(" ")[1]);
                deque.addFirst(x);
            } else if (command.startsWith("2 ")) {
                int x = Integer.parseInt(command.split(" ")[1]);
                deque.addLast(x);
            } else if (command.equals("3")) {
                System.out.println(deque.isEmpty() ? -1 : deque.pollFirst());
            } else if (command.equals("4")) {
                System.out.println(deque.isEmpty() ? -1 : deque.pollLast());
            } else if (command.equals("5")) {
                System.out.println(deque.size());
            } else if (command.equals("6")) {
                System.out.println(deque.isEmpty() ? 1 : 0);
            } else if (command.equals("7")) {
                System.out.println(deque.isEmpty() ? -1 : deque.peekFirst());
            } else if (command.equals("8")) {
                System.out.println(deque.isEmpty() ? -1 : deque.peekLast());
            }
        }
    }
}