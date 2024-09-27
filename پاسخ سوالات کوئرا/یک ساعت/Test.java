
import java.util.Scanner;


/**
 * @Author: Mohammadyar Barandov
 *
 */

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() , b = sc.nextInt();

        if (a != 0 & b!=0) {
            a = Math.abs(12 - a);
            b = Math.abs(60 - b);
            if (a<10 & b <10)
                System.out.println("0"+a+":"+"0"+b);
            else if (a <10 & b>=10)
                System.out.println("0"+a+":"+b);
            else if (a>=10 & b<10)
                System.out.println(a+":0"+b);
            else
                System.out.println(a+":"+b);
        }
        else if (a==0 & b==0)
            System.out.println("00:00");
        else if (a==0){
            b = Math.abs(60 - b);
            if (b<10)
                System.out.println("00:0"+b);
            else
                System.out.println("00:"+b);
        }
        else if (b==0) {
            a = Math.abs(12 - a);
            if (a < 10)
                System.out.println("0" + a + ":00");
            else
                System.out.println(a + ":00");
        }
        sc.close();
    }

}