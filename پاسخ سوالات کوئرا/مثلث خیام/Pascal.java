import java.util.Scanner;

public class Pascal{
    private static long[][] seen = new long[50][50];
    private static long[][] value = new long[50][50];

    // مثلث خيام پاسکال
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print(khayam(i, j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static long khayam (int i, int j){
                if (seen[i][j] == 1)
                    return value[i][j];
                seen[i][j] = 1;
                if (j == 0 | i == j)
                    value[i][j] = 1;
                else
                    value[i][j] = (khayam(i-1,j)) + (khayam(i-1,j-1));

                return value[i][j];
            }

}
