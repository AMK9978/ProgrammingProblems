import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by AMK on 7/30/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> arrayList[] = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            arrayList[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            arrayList[x].add(y);
            arrayList[y].add(x);
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        int vis[] = new int[n + 1];
        int max = -1;
        while (!queue.isEmpty()){
            int x = queue.poll();
            if (vis[x] != 0){
                continue;
            }
            vis[x] = 1;
            int O_o = 0;
            for (int i = 0; i < arrayList[x].size(); i++) {
                {
                    O_o++;
                    queue.add(arrayList[x].get(i));
                }
            }
            if (O_o > max){
                max = O_o;
            }
        }
        System.out.println(max);
    }
}
