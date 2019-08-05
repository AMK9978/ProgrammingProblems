import java.util.*;

/**
 * Created by AMK on 8/2/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int x = scanner.nextInt();
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] == 0){
                    int k = 0, kk = j;
                    while (k < x){
                        if (arr[kk] == 0) {
                          k++;
                        }
                        kk++;
                    }
                    if (k == x) {
                        while (arr[kk] != 0)
                            kk++;
                        arr[kk] = i;
                        break;
                    }
                }
            }
        }
        for (int i = 1; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr[arr.length - 1]);
    }
}