import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by AMK on 8/2/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Member> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            Member member = new Member(a,b);
            arrayList.add(member);
        }
        int ans = n + 1;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i).a != arrayList.get(j).a){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
    static class Member{
        int a,b;

        public Member(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}
