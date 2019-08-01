import java.util.*;

/**
 * Created by AMK on 7/29/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int O_o = 0;
        while (true) {
            O_o++;
            int n = scanner.nextInt();
            int d = scanner.nextInt();
            if (n == d && d == 0) {
                break;
            }
            int ff = 0;
            ArrayList<Point> arrayList = new ArrayList<>();
            if (n == 0) {
                System.out.println("Case " + (O_o) + ": " + 0);
                continue;
            }
            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                Point point = new Point();
                point.x = x;
                point.y = y;
                double r = Math.sqrt(d * d - y *y);
                point.L = point.x - r;
                point.R = point.x + r;
                arrayList.add(point);
                if (y > d) {
                    ff = 1;
                }
            }
            if (ff != 1) {
                Collections.sort(arrayList);
                double prevL = arrayList.get(0).L;
                double prevR = arrayList.get(0).R;
                int ans = 1;
                for (int i = 1; i < arrayList.size(); i++) {
                   if (arrayList.get(i).L <= prevR){
                       prevL = arrayList.get(i).L;
                       if (prevR >= arrayList.get(i).R)
                           prevR = arrayList.get(i).R;
                   }else {
                       prevL = arrayList.get(i).L;
                       prevR = arrayList.get(i).R;
                       ans++;
                   }
                }
                System.out.println("Case " + (O_o) + ": " + ans);
            } else {
                System.out.println("Case " + (O_o) + ": " + -1);
            }
        }
    }

    static class Point implements Comparable<Point> {
        int x, y;
        double L,R;
        @Override
        public int compareTo(Point member) {
            if (member.L < this.L) {
                return 1;
            } else if (member.L > this.L) {
                return -1;
            } else {
                if (member.R > this.R) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}