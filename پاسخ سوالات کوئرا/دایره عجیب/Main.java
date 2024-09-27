

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count=0;
        int current=0;

        while(true){
            count++;
            current+=k;
            current %=n;
            if (current == 0)
                break;
        }
        System.out.println(count);

    }
}

