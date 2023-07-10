import java.util.Scanner;

/**
 * @Author: Mohammadyar Barandov
 *
 * simpler solution without need of using array.
 */
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        for (int i = 0; i < n; i++) {
            System.out.print("copy of ");
        }
        System.out.println(s);

        sc.close();
    }

}