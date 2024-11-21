

import java.util.Scanner;


/**
 * @Author: Mohammadyar Barandov
 *
 */

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() , m=sc.nextInt();
        int stars=0;
        String sky = new String("");
        for (int i = 0; i < n; i++) {
            sky = sc.next();
            for (int j = 0; j < m; j++) {
                if (sky.charAt(j) == '*')
                    stars++;
            }
        }
        System.out.println(stars);
        sc.close();
    }

}