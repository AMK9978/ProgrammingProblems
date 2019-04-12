import java.math.BigInteger;
import java.util.Scanner;

public class Mine {
    private static String ans = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int P = scanner.nextInt();
        for (int i = 0; i < P; i++) {
            scanner.nextInt();
            String s = scanner.next();
            int p = Integer.parseInt(s.split("/")[0]);
            int q = Integer.parseInt(s.split("/")[1]);
            System.out.print(i + 1 + " ");
            Calc(p, q, 1);
            ans = "1" + ans;
            System.out.println(new BigInteger(ans, 2).longValue());
            ans = "";
        }
    }

    private static int Calc(int p, int q, int i) {
        if (p == 1 && q == 1) {
            return i;
        }
        if (p > q) {
            // right child:
            ans = "1" + ans;
            return Calc(p - q, q, i + 1);
        } else {
            // left child:
            ans = "0" + ans;
            return Calc(p, q - p, i + 1);
        }
    }

}
