import java.util.*;

/**
 * Created by AMK on 7/30/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main2 {
    private static HashMap<String, Integer> table = new HashMap<>();
    private static HashMap<String, Long> memo = new HashMap<>();
    private static ArrayList<String> keys = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String W = scanner.next();
        for (int i = 0; i < N; i++) {
            String str = scanner.next();
            int val = scanner.nextInt();
            keys.add(str);
            table.put(str, val);
        }
        System.out.println(Calc(W));
    }
    private static long Calc(String string){
        if (memo.containsKey(string)) {
            return memo.get(string);
        }
        if (string.length() == 0){
            return 0;
        }
        long mark = table.containsKey(string) ? table.get(string) : 0;
        int INF = 1000000007;
        for (String key : keys) {
            if (string.startsWith(key)) {
                mark += (table.get(key) * Calc(string.substring(key.length(), string.length())) % INF);
            }
        }
        memo.put(string,mark % INF);
        return mark % INF;
    }
}
