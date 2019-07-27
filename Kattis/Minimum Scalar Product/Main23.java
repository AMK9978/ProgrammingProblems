import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by AMK on 7/27/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            ArrayList<Long> arrayList = new ArrayList<>();
            ArrayList<Long> arrayList1 = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                arrayList.add(scanner.nextLong());
            }
            for (int j = 0; j < n; j++) {
                arrayList1.add(scanner.nextLong());
            }
            Collections.sort(arrayList);
            Collections.sort(arrayList1,Collections.reverseOrder());
            Long ans = 0L;
            for (int j = 0; j < n; j++) {
                ans += arrayList.get(j) * arrayList1.get(j);
            }
            System.out.println("Case #" + (i + 1) + ": " + ans);
        }
    }
}
