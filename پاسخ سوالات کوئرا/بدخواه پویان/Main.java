

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int d = sc.nextInt();


        for (int i = 1; i < 10; i++) {
            int s = (d*i)%p;
            if (s<=p/2 & s>=0) {
                System.out.println(d*i);
            break;
            }
        }


    }
}
