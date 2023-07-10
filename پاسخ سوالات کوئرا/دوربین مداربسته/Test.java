

import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt() , y1 = sc.nextInt();
        int x2 = sc.nextInt() , y2 = sc.nextInt();
        int x3 = sc.nextInt() , y3 = sc.nextInt();

        if ((x1 == x2) && (y1==y2)) {
              System.out.print(x3+" "+y3);
        }
        else if ((x1 == x2) && (y1==y3)){
            System.out.println(x3+" "+y2);
        }
        else if ((x1 == x3) && (y1==y3)){
            System.out.println(x2+" "+y2);
        }
        else if ((x1 == x3) && (y1==y2)){
            System.out.println(x2+" "+y3);
        }
        else if ((x1 == x3) && (y2==y3)){
            System.out.println(x2+" "+y1);
        }
        else if ((x2 == x3) && (y2==y3)){
            System.out.println(x1+" "+y1);
        }
        else if ((x2 == x1) && (y2==y3)){
            System.out.println(x3+" "+y1);
        }
        else if ((x2 == x3) && (y2==y1)){
            System.out.println(x1+" "+y3);
        }
        else if ((x2 == x3) && (y1==y3)){
            System.out.println(x1+" "+y2);
        }
        else
            System.out.print(x1+" "+y1);
        sc.close();
    }
    }


