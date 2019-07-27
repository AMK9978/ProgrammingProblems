import java.util.*;

/**
 * Created by AMK on 7/27/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int T = scanner.nextInt();
        ArrayList<Member>arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Member member = new Member();
            member.money = x;
            member.time = y;
            arrayList.add(member);
        }
        arrayList.sort(Collections.reverseOrder());
        int amount = 0;
        for (int i = T - 1; i > -1; i--) {
            for (int j = 0; j < arrayList.size(); j++) {
                if (arrayList.get(j).time >= i){
                    amount += arrayList.get(j).money;
                    arrayList.remove(j);
                    break;
                }
            }
        }
        System.out.println(amount);
    }

    static class Member implements Comparable<Member> {
        int time, money;

        @Override
        public String toString() {
            return "Member{" +
                    "time=" + time +
                    ", money=" + money +
                    '}';
        }

        @Override
        public int compareTo(Member member) {
            return this.money > member.money ? 1 : -1;
        }
    }
}
