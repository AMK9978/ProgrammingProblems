import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int N = scanner.nextInt();
        int arr[] = new int[N];
        int memo[][] = new int[N + 1][T + 1];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        // We solve it like a knapsack problem, but assume any empty space is negative and
        // we're gonna fill it as much as possible,thus in best position,
        // memo[N][T] will be zero,weight of any item is length of rest
        // value of any item is again length,so any item val/weight = 1 and we're only want to fill it
        for (int i = 0; i <= T; i++) {
            memo[0][i] = -i;
        }
        int mark[][] = new int[N + 1][T + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= T; j++) {
                if (arr[i - 1] <= j && memo[i - 1][j] - 1 < memo[i][j - arr[i - 1]]) {
                    memo[i][j] = memo[i - 1][j - arr[i - 1]];
                    mark[i][j] = 1;
//                    System.out.println(i + ",J:" + j);
                }else{
                    memo[i][j] = memo[i - 1][j] - 1;
                }
            }
        }
        int j = T;
        int belong[] = new int[N + 1];
        /*Problem has two lines of rest
            we have to calculate which one of musicians can rest in the first line,
            rest belong to second line:
        */
        for (int i = N; j > 0 && i > 0 ; i--) {
            if (mark[i][j] == 1){
                j -= arr[i - 1];
                belong[i - 1] = 1;
            }
        }
        //We're sure any musician that doesn't belong to first line belong to second:
        int one = 0 , two = 0;
        for (int i = 0; i < N; i++) {
            if (belong[i] == 1){
                System.out.print(one + " ");
                one += arr[i];
            }else{
                System.out.print(two + " ");
                two += arr[i];
            }
        }

    }
}
