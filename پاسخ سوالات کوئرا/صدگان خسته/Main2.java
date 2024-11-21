

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        reverse(num1,num2);


    }

    private static void reverse(int num1, int num2){

        int b=0,c=0;
        int a = num1;
        int d = num2;
        while (a!=0){
            b = b*10 + a%10;
            a/=10;
        }

        while (d!=0){
            c = c*10 + d%10;
            d/=10;
        }

        if (b < c)
            System.out.println(num1+" "+"<"+" "+num2);
        else if (c < b)
            System.out.println(num2+" "+"<"+" "+num1);
        else
            System.out.println(num1+" "+"="+" "+num2);
    }
}
