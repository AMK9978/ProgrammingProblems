import java.util.Scanner;

/**
 * Created by AMK on 7/28/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextInt();
        long sum = 0;
        for (int i = 0; i < n / 2; i++) {
            sum += i;
        }
        sum = sum * 2;
        if (n % 2 == 0){
            sum += n / 2;
        }
        n++;
        System.out.println(sum/n);
    }
}
