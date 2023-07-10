import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt() , c = sc.nextInt();
        int [] a = {0,10,9,8,7,6,5,4,3,2,1};
        int [] b = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int [] rb = {0,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};


        if (c >=1 && c<=10){
            System.out.println("Right "+a[r]+" "+b[c]);

        }
        else
            System.out.println("Left "+a[r]+" "+rb[c]);
        sc.close();
    }
    }


