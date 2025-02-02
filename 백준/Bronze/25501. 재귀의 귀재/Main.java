import java.util.*;

public class Main{
    static int cnt = 0;
    public static int recursion(String s, int l, int r){
        cnt += 1;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            a.add(sc.nextLine());
        }

        for (String s: a) {
            System.out.println(isPalindrome(s) + " " + cnt);
            cnt = 0;
        }
    }
}