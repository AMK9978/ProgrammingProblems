import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt(), k = in.nextInt();
        int[][] p = new int[n][m];
        for (int i = 0; i < k; i++) {
            p[in.nextInt() - 1][in.nextInt() - 1] = 1;
        }
        if (k % 2 > 0) {
            System.out.println("0");
        } else if (k == n * m) {
            System.out.println("-1");
        } else {
            a:
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (p[i][j] == 0) {
                        System.out.println("1\n" + (i + 1) + " " + (j + 1));
                        break a;
                    }
                }
            }
        }
    }
}