
import java.util.Scanner;

public class Test3 {
        // کد تخفیف
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String t = sc.next();
        String[] s = new String[n];
        boolean Found = false;
        boolean found2 = false;

        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }



        for (int k = 0; k < n; k++) {
            int countT = 0, countS = 0;
            boolean failure = false;
            for (int i = 0; i < t.length(); i++) {
                for (int j = 0; j < s[k].length(); j++) {
                    if (t.charAt(i) == s[k].charAt(j) ){
                        countT++;
                        break;
                    }
                }
            }
            if (countT == t.length())
                Found = true;
            else
                Found = false;

            for (int j = 0; j < s[k].length(); j++) {
                for (int i = 0; i < t.length(); i++) {
                    if (s[k].charAt(j) == t.charAt(i) ){
                        countS++;
                        break;
                    }
                }
            }

            if (countS == s[k].length())
                found2 = true;
            else
                found2 = false;

            if (!Found | !found2)
                failure = true;

            if (failure)
                System.out.println("No");
            else
                System.out.println("Yes");
        }



        sc.close();
    }
}
