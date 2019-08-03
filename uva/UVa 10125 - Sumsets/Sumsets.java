import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by AMK on 8/2/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Sumsets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n == 0)
                break;
            ArrayList<Integer> arrayList = new ArrayList<>();
            HashSet<Integer> hashSet = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int xx = scanner.nextInt();
                arrayList.add(xx);
                hashSet.add(xx);
            }
            Collections.sort(arrayList);
            int x, y, z;
            boolean flag = false;
            for (int i = n - 1; i > -1; i--) {
                x = arrayList.get(i);
                for (int j = 0; j < n; j++) {
                    y = arrayList.get(j);
                    if (y == x) {
                        continue;
                    }
                    for (int k = 0; k < n; k++) {
                        z = arrayList.get(k);
                        if (z == y || z == x || (x - (y + z)) == z || (x - (y + z)) == y) {
                            continue;
                        }
                        if (x - (y + z) != z && x - (y + z) != y && (x - (y + z) != x)) {
                            if (hashSet.contains(x - (y + z))) {
                                System.out.println(x);
                                flag = true;
                                break;
                            }
                        }
                    }
                    if (flag) {
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
            if (!flag)
                System.out.println("no solution");
        }
    }
}
