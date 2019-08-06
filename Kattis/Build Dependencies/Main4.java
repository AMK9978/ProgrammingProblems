import java.util.*;

/**
 * Created by AMK on 8/6/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main4 {
    private static int vis[];
    private static ArrayList<Integer> adjList[];
    private static Stack<Integer> order = new Stack<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine().split(" ")[0]);
        vis = new int[N];
        adjList = new ArrayList[N];
        // Name of nodes to index mapping:
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        // Index of nodes to name mapping:
        Hashtable<Integer, String> hashtable_reverse = new Hashtable<>();
        String[] arr = new String[N];
        // Three following for loops will used for parsing lines and mapping nodes together:
        for (int i = 0; i < N; i++) {
            String inp = scanner.nextLine();
            String node_name = inp.split(" ")[0].substring(0, inp.split(" ")[0].length() - 1);
            hashtable.put(node_name, i);
            hashtable_reverse.put(i, node_name);
            arr[i] = inp;
        }
        for (int i = 0; i < N; i++) {
            adjList[i] = new ArrayList<>();
        }
        for (String anArr : arr) {
            String el[] = anArr.split(" ");
            String O_o = el[0].substring(0, el[0].length() - 1);
            for (int j = 1; j < el.length; j++) {
                adjList[hashtable.get(el[j])].add(hashtable.get(O_o));
            }
        }
        String name = scanner.nextLine().trim();
        topsort(hashtable.get(name));
        while (order.size() != 0) {
            System.out.println(hashtable_reverse.get(order.pop()));
        }
    }

    private static void topsort(int u) {
        if (vis[u] == 1) {
            return;
        }
        vis[u] = 1;
        for (int i = 0; i < adjList[u].size(); i++) {
            int v = adjList[u].get(i);
            topsort(v);
        }
        order.add(u);
    }
}
