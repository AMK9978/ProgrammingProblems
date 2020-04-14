import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    private static int T, N;
    private static int[] weigh;
    private static X[][] memo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();
        N = scanner.nextInt();
        weigh = new int[N + 1];
        memo = new X[N + 1][T + 1];
        for (int i = 0; i < N; i++) {
            weigh[i] = scanner.nextInt();
        }
        X res = func(0, T, new ArrayList<>());
//        System.out.println(res.arrayList);
        int one = 0, two = 0;
        for (int i = 0; i < N; i++) {
            if (res.arrayList != null && res.arrayList.contains(i)) {
                System.out.print(one + " ");
                one += weigh[i];
            } else {
                System.out.print(two + " ");
                two += weigh[i];
            }
        }
    }

    private static X func(int id, int rem, ArrayList<Integer> arrayList) {
        if (rem < 0) {
            return new X(arrayList, Integer.MIN_VALUE);
        }
        if (id == N) {
            return new X(arrayList, -rem);
        }
        if (weigh[id] > rem) {
            return func(id + 1, rem, arrayList);
        }
        if (memo[id][rem] != null) {
            return memo[id][rem];
        }
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(id);
        arrayList1.addAll(arrayList);
        X x1 = func(id + 1, rem - weigh[id], arrayList1);
        X x2 = func(id + 1, rem, arrayList);
        if (x1.res >= x2.res) {
            memo[id][rem] = x1;
        } else {
            memo[id][rem] = x2;
        }
        return memo[id][rem];
    }

    private static class X {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int res = 0;

        X(ArrayList<Integer> arrayList, int res) {
            this.arrayList = arrayList;
            this.res = res;
        }

        @Override
        public String toString() {
            return "X{" +
                    "arrayList=" + arrayList +
                    ", res=" + res +
                    '}';
        }
    }
}
