import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Float> credits = new ArrayList<>();
        ArrayList<String> grades = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            names.add(sc.next());
            float credit = sc.nextFloat();
            credits.add(credit);
            grades.add(sc.next());
        }

        float cnt = 0;
        float sum = 0;

        // 성적 계산
        for (int i = 0; i < 20; i++) {
            float credit = credits.get(i);
            String grade = grades.get(i);

            switch (grade) {
                case "A+": sum += 4.5 * credit; break;
                case "A0": sum += 4.0 * credit; break;
                case "B+": sum += 3.5 * credit; break;
                case "B0": sum += 3.0 * credit; break;
                case "C+": sum += 2.5 * credit; break;
                case "C0": sum += 2.0 * credit; break;
                case "D+": sum += 1.5 * credit; break;
                case "D0": sum += 1.0 * credit; break;
            }

            if (!grade.equals("P")) {
                cnt += credit;
            }
        }
        float ans = sum / cnt;
        System.out.print(ans);
    }
}