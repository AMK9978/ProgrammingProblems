import java.util.Scanner;

/**
 * Created by AMK on 7/25/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int pos = 20;
        int sum = 0;
        int rem = 4;
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            sum += x;
            pos += x;
            if (sum < 10){
                rem--;
            }else{
                rem = 4;
                sum = 0;
            }
            if (rem == 0) {
                System.out.println("Nothing");
                return;
            }
            if (pos >= 100){
                System.out.println("Touchdown");
                return;
            }else if (pos <= 0){
                System.out.println("Safety");
                return;
            }
        }
        System.out.println("Nothing");
    }
}
