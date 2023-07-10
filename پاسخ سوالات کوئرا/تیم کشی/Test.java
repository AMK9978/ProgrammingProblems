import java.util.Scanner;

/**
 * @Author: Mohammadyar Barandov
 */
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int a3 = sc.nextInt();
        int b3 = sc.nextInt();

        int count = 0;
        while (a1 !=0 & b1!=0){
            a1--;
            b1--;
            count++;
        }
        while (a2 !=0 & b2!=0){
            a2--;
            b2--;
            count++;
        }
        while (a3 !=0 & b3!=0){
            a3--;
            b3--;
            count++;
        }
        System.out.println(count);
        sc.close();
    }

}