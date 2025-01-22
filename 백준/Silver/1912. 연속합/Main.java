import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> t = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();

        int num = sc.nextInt();
        int sum = 0;
        int max = Integer.MIN_VALUE;

        // 입력과 초기 최대값 설정
        for (int i = 0; i < num; i++) {
            int current = sc.nextInt();
            t.add(current);
            max = Math.max(max, current); // 단일 요소 최대값 갱신
        }
        sc.close();

        // 연속된 양수 합산 및 새로운 배열 생성
        for (int i = 0; i < num; i++) {
            if (t.get(i) >= 0) {
                sum += t.get(i); // 양수 합산
            } else {
                if (sum > 0) {
                    a.add(sum); // 양수 구간 저장
                    sum = 0; 
                }
                a.add(t.get(i)); // 음수 저장
            }
        }
        if (sum > 0) { // 마지막 양수 구간 추가
            a.add(sum);
        }

        // 연속합 계산
        sum = 0; // 합 초기화
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);

            // 최대값 갱신
            max = Math.max(max, sum);

            // 합이 음수가 되면 초기화
            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.println(max);
    }
}