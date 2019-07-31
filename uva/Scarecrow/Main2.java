import java.util.*;

/**
 * Created by AMK on 7/30/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            String line = scanner.next();
            int ans = 0;
            int a = line.charAt(0) == '#' ? 0 : 1;
            for (int j = 1; j < line.length(); j++) {
                if (a == 1){
                    ans++;
                    j++;
                    a = 0;
                }else{
                    if (line.charAt(j) == '.'){
                        a++;
                    }
                }
            }
            if (a == 1){
                ans++;
            }
            System.out.println("Case " + (i + 1) + ": " + ans);
        }
    }
}
