import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by AMK on 8/11/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main {
    private static BigInteger[] bigIntegers = new BigInteger[1000001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String line[] = scanner.nextLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int m = Integer.parseInt(line[1]);
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 2; i < m + 2; i++) {
                arrayList.add(Integer.valueOf(line[i]));
            }
            int arr[] = new int[n + 1];
            int  j,i;
            //for P position:
            arr[0] = 0;
            for(i = 1; i <= n; ++i) {
                for(j = 0; j < m; ++j) {
                    if (i - arrayList.get(j) >= 0) {
                        if (arr[i - arrayList.get(j)] == 0) {
                            //for N position:
                            arr[i] = 1;
                            break;
                        }
                    }
                }
            }
            if (arr[n] == 1){
                System.out.println("Stan wins");
            }else{
                System.out.println("Ollie wins");
            }
        }
    }
}
