import java.util.Scanner;

/**
 * @Author: Mohammadyar Barandov
 */
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n =sc.nextLong();

        n = n % 9;
        if (n==0)
            System.out.print(9);
        else
            System.out.println(n);

        sc.close();
    }

}