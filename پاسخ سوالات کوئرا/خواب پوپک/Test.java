import java.util.*;

/**
 * @Author: Mohammadyar Barandov
 */
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();

        int count = 0;

            for (int i = 1; i <= a; i++)
                if (a % i == 0)
                    for (int j = 1; j <= b; j++)
                        if (b % j == 0)
                            if (i + j <= x)
                                count++;

            System.out.println(count);


        sc.close();
    }

}