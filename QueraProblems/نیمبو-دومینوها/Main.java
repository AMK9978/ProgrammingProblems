
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[][] chars = new char[n][m];
        int ans = 0;
        int arr[] = new int[m];
        for (int i = 0; i < n; i++) {
            chars[i] = scanner.next().toCharArray();
            int flag = 0;
            for (int j = 0; j < m; j++) {;
                if (chars[i][j] == '|') {
                    flag = 1;
                } else {
                    if (flag == 1) {
                        flag = 0;
                        ans++;
                    }
                }
                if (chars[i][j] == '-') {
                    if (arr[j] == 0) {
                        ans++;
                        arr[j] = 1;
                    }
                } else {
                    arr[j] = 0;
                }
            }
            if (flag == 1) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}