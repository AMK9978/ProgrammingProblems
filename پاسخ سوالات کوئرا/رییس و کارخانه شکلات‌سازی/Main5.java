import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by AMK on 8/1/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main5 {
    private static int INF = 999999999;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> arrayList[] = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            arrayList[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            int x = scanner.nextInt();
            arrayList[x - 1].add(i);
        }
        System.out.println(Calc(arrayList, 0));

    }

    private static value Calc(ArrayList<Integer>[] arrayList, int i) {
        int pen = 1;
        int members = arrayList[i].size();
        if (arrayList[i].size() == 0) {
            return new value(pen,0);
        }
        for (int j = 0; j < arrayList[i].size(); j++) {
            value val = Calc(arrayList, arrayList[i].get(j));
            pen += val.pen;
            members += val.members;
        }
        return  new value(pen + members,members);
    }

    static class value {
        int pen,members;

        public value(int pen, int members) {
            this.pen = pen;
            this.members = members;
        }

        @Override
        public String toString() {
            return  pen + "";
        }
    }
}
