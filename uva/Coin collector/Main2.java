import java.util.*;

/**
 * Created by AMK on 7/30/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int m = scanner.nextInt();
                arrayList.add(m);
            }
            int ans = 1;
            int sum = 1;
            for (int j = 1; j < arrayList.size() - 1; j++) {
                if (sum + arrayList.get(j) < arrayList.get(j + 1)){
                    sum += arrayList.get(j);
                    ans++;
                }
            }
            System.out.println(++ans);
        }
    }
}
