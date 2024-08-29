import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> strList = new ArrayList<>(); 

        int num = sc.nextInt();
        sc.nextLine(); // 빈 문자열 반환 방지

        for (int i = 0; i < num; i++) {
            String input = sc.nextLine();
            if (!strList.contains(input)) { // 중복된 단어가 아닌 경우에만 입력
                strList.add(input);
            }
        }
        sc.close();

        // 문자열 리스트를 길이 순서로 정렬, 길이가 같으면 사전 순으로 정렬
        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // 길이 비교
                int lenCmp = Integer.compare(s1.length(), s2.length());

                if (lenCmp != 0) { // 길이가 다른 경우 길이 순으로 정렬
                    return lenCmp; 
                } else {
                    return s1.compareTo(s2); // 길이가 같은 경우 사전 순으로 정렬
                }
            }
        });

        // 결과 출력
        for (String str : strList) {
            System.out.println(str);
        }
    }
}