import java.util.*;

/**
 * Created by AMK on 8/2/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int R, C, GR, GC, LR, LC;
            String line[] = scanner.nextLine().split(" ");
            R = Integer.parseInt(line[0]);
            C = Integer.parseInt(line[1]);
            GR = Integer.parseInt(line[2]);
            GC = Integer.parseInt(line[3]);
            LR = Integer.parseInt(line[4]);
            LC = Integer.parseInt(line[5]);
            Queue<Pair> queue = new LinkedList<>();
            int arr[][] = new int[101][101];
            queue.add(new Pair(GR,GC, 0));
            boolean flag = true;
            while (!queue.isEmpty()){
                Pair loc = queue.poll();
                if (arr[loc.x][loc.y] != 0){
                    continue;
                }
                arr[loc.x][loc.y] = 1;
                if (loc.y == LC && loc.x == LR){
                    System.out.println(loc.counter);
                    flag = false;
                    break;
                }
                if (loc.y - 2>= 1){
                    if (loc.x - 1>= 1){
                        queue.add(new Pair(loc.x - 1, loc.y - 2,loc.counter + 1));
                    }
                    if (loc.x + 1 <= R){
                        queue.add(new Pair(loc.x + 1, loc.y - 2,loc.counter + 1));
                    }
                }
                if (loc.y + 2 <= C){
                    if (loc.x - 1>= 1){
                        queue.add(new Pair(loc.x - 1, loc.y + 2,loc.counter + 1));
                    }
                    if (loc.x + 1 <= R){
                        queue.add(new Pair(loc.x + 1, loc.y + 2,loc.counter + 1));
                    }
                }
                if (loc.y - 1>= 1){
                    if (loc.x - 2>= 1){
                        queue.add(new Pair(loc.x - 2, loc.y - 1,loc.counter + 1));
                    }
                    if (loc.x + 2 <= R){
                        queue.add(new Pair(loc.x + 2, loc.y - 1,loc.counter + 1));
                    }
                }
                if (loc.y + 1 <= C){
                    if (loc.x - 2 >= 1){
                        queue.add(new Pair(loc.x - 2, loc.y + 1,loc.counter + 1));
                    }
                    if (loc.x + 2 <= R){
                        queue.add(new Pair(loc.x + 2, loc.y + 1,loc.counter + 1));
                    }
                }
            }
            if (flag)
                System.out.println("impossible");
        }
    }
    static class Pair{
        int x,y,counter;

        Pair(int x, int y, int counter) {
            this.x = x;
            this.y = y;
            this.counter = counter;
        }
    }
}