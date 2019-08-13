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
        while (scanner.hasNext()) {
            int x = scanner.nextInt();
            if (x == 0 || x == 1) {
                System.out.println(1);
                continue;
            }
            System.out.println((int) Math.ceil(Math.log10(2 * Math.PI * x) /2 + x * Math.log10(x / Math.E)));
        }
    }
}
