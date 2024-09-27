

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int N = sc.nextInt();
        int area=0;
        for (int i = 0; i < N; i++) {
            area+= sc.nextInt() * sc.nextInt();
        }
        System.out.println(area/W);

    }
    }

