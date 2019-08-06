import java.util.*;

/**
 * Created by AMK on 8/6/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int n = scanner.nextInt();
            int t = scanner.nextInt();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                arrayList.add(scanner.nextInt());
            }
            int dist[] = new int[3605];
            Arrays.fill(dist, 3601);
            Queue<Integer> queue = new LinkedList<>();
            queue.add(0);
            dist[0] = 0;
            while (!queue.isEmpty()){
                int curr = queue.poll();
                for (int j = 0; j < arrayList.size(); j++) {
                    int node = curr + arrayList.get(j);
                    node = Math.max(0, node);
                    node = Math.min(node, 3600);
                    if (dist[node] > dist[curr] + 1){
                        dist[node] = dist[curr] + 1;
                        queue.add(node);
                    }
                }
            }
            int min = 0;
            int time = 3601;
            for (int j = t; j < dist.length; j++) {
                if (dist[j] < time){
                    min = j - t;
                    time = dist[j];
                    break;
                }
            }
            System.out.println(time + " " +min);
        }
    }
}
