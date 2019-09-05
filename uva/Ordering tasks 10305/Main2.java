import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    private static ArrayList<Integer> arrayList[];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            if (n == m && m == 0)
                break;
            arrayList = new ArrayList[n + 1];
            for (int i = 0; i <= n; i++) {
                arrayList[i] = new ArrayList<>();
            }

            for (int i = 0; i < m; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                arrayList[a].add(b);
            }
            Stack stack = new Stack();
            boolean visited[] = new boolean[n + 1];
            for (int i = 1; i <= n; i++)
                if (!visited[i])
                    topol(i, visited, stack);

            while (!stack.empty())
                System.out.print(stack.pop() + " ");
            System.out.println();
        }
    }

    private static void topol(int v, boolean visited[],
                                            Stack stack)
    {
        visited[v] = true;
        Integer i;
        for (Integer integer : arrayList[v]) {
            i = integer;
            if (!visited[i])
                topol(i, visited, stack);
        }
        stack.push(v);
    }

}
