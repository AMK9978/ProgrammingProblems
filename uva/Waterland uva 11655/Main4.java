import java.util.*;

public class Main4 {
    private static ArrayList<Integer> arrayList[];
    private static int[] visit;
    private static int L = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int k = 1; k <= N; k++) {
            L = scanner.nextInt();
            int T = scanner.nextInt();
            arrayList = new ArrayList[L + 1];
            for (int i = 1; i <= L; i++) {
                arrayList[i] = new ArrayList<>();
            }
            for (int i = 0; i < T; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                arrayList[a].add(b);
            }
            Stack<Integer> stack = new Stack<>();
            boolean visited[] = new boolean[L + 1];
            int num_paths[] = new int[L + 1];
            for (int i = 1; i <= L; i++)
                if (!visited[i])
                    topol(i, visited, stack);
            System.out.print("Case " + k + ": ");
            int aa[] = new int[L + 1];
            num_paths[1] = 1;
            aa[1]++;
            while (!stack.empty()) {
                int ss = stack.pop();
                for (int i = 0; i < arrayList[ss].size(); i++) {
                    num_paths[arrayList[ss].get(i)] += num_paths[ss] % 100000;
                    aa[arrayList[ss].get(i)] +=  (aa[ss] +
                            num_paths[ss]* (ss == 1 ? 0 : 1) )% 100000;
                }
            }
            System.out.println(aa[L] % 100000 + " " + num_paths[L] % 100000);
        }
    }

    private static void topol(int v, boolean visited[],
                              Stack stack) {
        visited[v] = true;
        Integer i;
        for (Integer integer : arrayList[v]) {
            i = integer;
            if (!visited[i])
                topol(i, visited, stack);
        }
        stack.push(v);
    }

    private static class Node {
        int v, cost = 1;
    }
}
