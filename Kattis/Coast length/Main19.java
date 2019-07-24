import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by AMK on 7/23/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int mat[] = new int[(N + 2) * (M + 2)];
        int i;
        for (i = 1; i <= N; i++) {
            String inp = scanner.next();
            int j;
            for (j = 1; j <= inp.length(); j++) {
                if (inp.charAt(j - 1) == '1') {
                    mat[i * (M + 2) + j] = 1;
                }
            }
        }
        int ans = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (i = 0; i < M + 2; i++) {
            queue.add(i);
            queue.add((N + 1) * (M + 2) + i);
        }
        for (i = 0; i < N + 2; i++) {
            queue.add(i * (M + 2));
            queue.add((M + 2) * i + M + 1);
        }
        int vis[] = new int[mat.length];
        while (!queue.isEmpty()) {
            int code = queue.poll();
            if (vis[code] == 1){
                continue;
            }
            vis[code] = 1;
            if (mat[code] == 0) {
                try {
                    if (mat[code - 1] == 1) {
                        ans++;
                    } else {
                        if (vis[code - 1] == 0)
                            queue.add(code - 1);
                    }
                }catch (Exception ignored){}
                try {
                    if (mat[code + 1] == 1) {
                        ans++;
                    } else {
                        if (vis[code + 1] == 0)
                            queue.add(code + 1);
                    }
                }catch (Exception ignored){}
                try {
                    if (mat[code - (M + 2)] == 1) {
                        ans++;
                    } else {
                        if (vis[code - (M + 2)] == 0)
                            queue.add(code - (M + 2));
                    }
                }catch (Exception ignored){}
                try {
                    if (mat[code + (M + 2)] == 1) {
                        ans++;
                    } else {
                        if (vis[code + (M + 2)] == 0)
                            queue.add(code + (M + 2));
                    }
                }catch (Exception ignored){}
            }
        }
        System.out.println(ans);
    }
}
