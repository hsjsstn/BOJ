import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        Map<Integer, Integer> c = new HashMap<Integer,Integer>();
        int avg, mid, mod = 0, ran;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int maxCnt = 0;

        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int n = sc.nextInt();
            a.add(n);
            sum += n;
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        sc.close();

        Collections.sort(a);

        for (int i = 0; i < num; i++) {
            c.put(a.get(i), c.getOrDefault(a.get(i), 0) + 1);
            if (c.get(a.get(i)) > maxCnt) {
                maxCnt = c.get(a.get(i));
            }
        }

        // 최빈값이 maxCnt인 값을 모두 리스트에 추가
        ArrayList<Integer> m = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : c.entrySet()) {
            if (entry.getValue() == maxCnt) {
                m.add(entry.getKey());
            }
        }

        // 최빈값이 여러 개일 경우
        if (m.size() > 1) {
            Collections.sort(m); // 정렬
            mod = m.get(1); // 두번째로 작은 값 선택
        } else {
            mod = m.get(0); // 최빈값이 하나일 경우
        }

        double d = (double) sum / num; 
        
        avg = (int) Math.round(d); // 소수점 첫째 자리에서 반올림
        ran = max - min;
        mid = a.get(num/2);
        

        System.out.println(avg);
        System.out.println(mid);
        System.out.println(mod);
        System.out.println(ran);
    }
}