

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        sc.nextInt();

        int x1 = sc.nextInt();
        sc.nextInt();

        if (x1 > x)
            System.out.println("Right");
        else
            System.out.println("Left");


    }
}
