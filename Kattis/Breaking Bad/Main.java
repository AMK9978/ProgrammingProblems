import java.math.BigInteger;
import java.util.*;

public class Main {
    static int ansi = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> arrayList[] = new ArrayList[n];
        int arr[] = new int[n];
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arrayList[i] = new ArrayList<>();
        }
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            hashMap.put(name, i);
            names.add(name);
        }
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            String first = scanner.next();
            String second = scanner.next();
            arrayList[hashMap.get(first)].add(hashMap.get(second));
            arrayList[hashMap.get(second)].add(hashMap.get(first));
        }
        Set<String> first_ans = new HashSet<>();
        Set<String> sec_ans = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                continue;
            }
            Queue<Integer> queue = new LinkedList<>();
            queue.add(i);
            arr[i] = 1;
            first_ans.add(names.get(i));
            while (!queue.isEmpty()) {
                int curr = queue.poll();
                int color = arr[curr];
                for (int j = 0; j < arrayList[curr].size(); j++) {
                    if (arr[arrayList[curr].get(j)] == 0) {
                        queue.add(arrayList[curr].get(j));
                        if (color == 1) {
                            arr[arrayList[curr].get(j)] = 2;
                            sec_ans.add(names.get(arrayList[curr].get(j)));
                        } else {
                            arr[arrayList[curr].get(j)] = 1;
                            first_ans.add(names.get(arrayList[curr].get(j)));
                        }
                    } else if (arr[arrayList[curr].get(j)] == arr[curr]) {
                        System.out.println("impossible");
                        System.exit(0);
                    }
                }
            }
        }
        for (String name : first_ans) {
            System.out.print(name + " ");
        }
        System.out.println();
        for (String name : sec_ans) {
            System.out.print(name + " ");
        }
    }
}