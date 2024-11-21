import java.util.Scanner;

/**
 * @Author: Mohammadyar Barandov
 */
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        long countPos = 0, countNeq = 0, countZero = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] > 0)
                countPos++;
            else if (a[i] < 0)
                countNeq++;
            else
                countZero++;
        }

        if (countNeq == 0)
            System.out.println(0);
        else {
            System.out.println((countNeq*n) - countNeq);

        }

        sc.close();
    }

}