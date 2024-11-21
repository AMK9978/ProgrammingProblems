

import java.util.Scanner;


/**
 * @Author: Mohammadyar Barandov
 *
 */

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String str = sc.next();
        int count=0;
        for (int i = 0; i < k; i++) {
            String newStr = sc.next();
            if (newStr.indexOf(str.charAt(i)) > 4)
                count += (9 - newStr.indexOf(str.charAt(i)));
            else
                count += newStr.indexOf(str.charAt(i));
        }
        System.out.println(count);
        sc.close();
    }

}