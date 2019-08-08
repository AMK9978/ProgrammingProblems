import java.util.*;

/**
 * Created by AMK on 8/7/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            HashSet<String> hashSet = new HashSet<>();
            int j;
            ArrayList<Member> arrayList = new ArrayList<>();
            for (j = 0; j < n; j++) {
                String line = scanner.next();
                arrayList.add(new Member(line));
            }
            boolean flag = true;
            Collections.sort(arrayList);
            for (int k = 0; k < arrayList.size(); k++) {
                String line = arrayList.get(k).number;
                int o = 1;
                for (; flag && o <= line.length(); o++) {
                    String x = line.substring(0, o);
                    if (hashSet.contains(x)) {
                        System.out.println("NO");
                        flag = false;
                        break;
                    }
                }
                if (!flag){
                    break;
                }
                hashSet.add(line);
            }
            if (flag)
                System.out.println("YES");
        }
    }

    static class Member implements Comparable<Member> {
        String number;

        public Member(String number) {
            this.number = number;
        }

        @Override
        public int compareTo(Member member) {
            if (this.number.length() > member.number.length()) {
                return 1;
            } else if (this.number.length() == member.number.length()) {
                return 0;
            } else {
                return -1;
            }
        }
    }
}
