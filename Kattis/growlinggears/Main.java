import java.util.Scanner;

/**
 * Created by AMK on 8/11/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int id = 0;
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                int res = (b * b) /(4 * a) + c;
                if (res > max){
                    max = res;
                    id = j + 1;
                }
            }
            System.out.println(id);
        }
    }
}