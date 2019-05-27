
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        day[] days = new day[d + 1];
        HashMap<String, Member> hashMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            // [ day: 1 | time: 00:00:37 | name: mohammad ]
            scanner.next(); // [
            scanner.next();
            int x = Integer.parseInt(scanner.next()); // day number
            scanner.next();
            scanner.next();
            scanner.next();
            scanner.next();
            scanner.next();
            String name = scanner.next(); // NAME
            scanner.next();
            try {
                days[x].last = days[x].last;
            }catch (Exception e){
                days[x] = new day();
            }
            if (!hashMap.containsKey(name)) {
                days[x].first++;
                days[x].count++;
                days[x].last++;
                Member member = new Member();
                member.start = member.end = x;
                hashMap.put(name,member);
            } else {
                Member member = hashMap.get(name);
                if (member.end != x){
                    days[x].count++;
                }
                days[member.end].last--;
                member.end = x;
                days[x].last++;
            }
        }
        for (int q = 1; q < days.length; q++) {
            if (days[q] != null)
                System.out.println(days[q].count + " " + days[q].first + " " + days[q].last);
            else
                System.out.println(0 + " " + 0 + " " + 0);
        }
    }

    static class Member {
        int start, end;
    }

    static class day {
        int count = 0, first = 0, last = 0;
    }
}