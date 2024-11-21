
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int [][] array = new int[n+1][n+1];
        int result = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt() , y = sc.nextInt();
            result += array[x][y];
        }

        System.out.println(result);

        sc.close();
    }
}
