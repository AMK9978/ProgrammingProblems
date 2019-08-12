import java.util.Scanner;

/**
 * Created by AMK on 8/12/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            String line = scanner.next();
            for (int j = 0; j < line.length(); j++) {
                arr[i][j] = line.charAt(j) == 'W' ? 0 : 1;
            }
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            String s = scanner.next();
            int arr2[][] = new int[n][n];
            if (s.equals("90")){
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        arr2[k][n  - j - 1] = arr[j][k];
                    }
                }
                arr = arr2;
            }else if (s.equals("V")){
                for (int j = 0; j < arr.length; j++) {
                    for (int k = 0; k < n / 2; k++) {
                        int temp = arr[j][n - k - 1];
                        arr[j][n - k - 1] = arr[j][k];
                        arr[j][k] = temp;
                    }
                }
            }else{
                for (int j = 0; j < n / 2; j++) {
                    for (int k = 0; k < n; k++) {
                        int temp = arr[n - j - 1][k];
                        arr[n - j - 1][k] = arr[j][k];
                        arr[j][k] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] == 1 ? "B" : "W");
            }
            System.out.println();
        }
    }
}
