import java.util.*;

import static java.lang.System.exit;

/**
 * Created by AMK on 8/6/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main4 {
    private static Hashtable<String, Integer> hashtable = new Hashtable<>();
    private static Hashtable<Integer, String> hashtable_reverse = new Hashtable<>();
    private static Stack<Integer> stack = new Stack<>();
    private static int arr[][];
    private static int vis[];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        String origin, des;
        ArrayList<String> lines = new ArrayList<>();
        n = Integer.parseInt(scanner.nextLine().split(" ")[0]);
        arr = new int[33][33];
        vis = new int[33];
        for (int i = 0; i < n; i++) {
            String l = scanner.nextLine();
            lines.add(l);
            hashtable.put(l.split(" ")[0], i);
            hashtable_reverse.put(i, l.split(" ")[0]);
        }
        String req = scanner.nextLine();
        origin = req.split(" ")[0];
        des = req.split(" ")[1];
        for (int i = 0; i < lines.size(); i++) {
            String line[] = lines.get(i).split(" ");
            for (int j = 1; j < line.length; j++) {
                if (!hashtable.containsKey(line[j])) {
                    hashtable_reverse.put(n, line[j]);
                    hashtable.put(line[j], n++);
                }
                arr[i][hashtable.get(line[j])] = arr[hashtable.get(line[j])][i] = 1;
            }
        }
        stack.add(hashtable.get(origin));
       if (hashtable.get(origin) == null || hashtable.get(des) == null){
           System.out.println("no route found");
           return;
       }
        Calc(hashtable.get(origin), hashtable.get(des));
        System.out.println("no route found");
    }

    private static void Calc(int u, int v) {
        if (u == v) {
            Stack<Integer> res = new Stack<>();
            while (!stack.isEmpty()) {
                res.push(stack.pop());
            }
            while (!res.isEmpty()) {
                System.out.print(hashtable_reverse.get(res.pop()) + " ");
            }
            System.out.println();
            exit(0);
        }
        vis[u] = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[u][i] == 1 && vis[i] == 0) {
                stack.push(i);
                Calc(i, v);
            }
        }
        if (stack.isEmpty()) {
            System.out.println("no route found");
            exit(0);
        }
        stack.pop();

    }
}
