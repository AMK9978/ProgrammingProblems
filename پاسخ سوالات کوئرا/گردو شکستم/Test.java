import java.util.Scanner;

/**
 * @Author: Mohammadyar Barandov
 */
public class Test {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();

        long max = Math.max(x,y);
        long min = Math.min(x,y);

        long reminder = n % max, result = n / max;
        long minReminder = n % min , minResult = n / min;


        if (reminder == min)
            if (x == max)
                System.out.println(result+" "+"1");
            else
                System.out.println("1"+" "+result);
        else if (minReminder == 0)
            if (x == min)
                System.out.println(minResult+" "+minReminder);
            else
                System.out.println(minReminder+" "+minResult);
        else {
            if (x + y == n/2)
                System.out.println("2 2");
            else if (x>n & y>n)
                System.out.println(-1);
            else if (x>n & y==n)
                System.out.println("0 1");
            else if (x==n & y>n)
                System.out.println("1 0");

            else {

                if ((result * max) + (reminder * min) == n)
                    if (x == max)
                        System.out.println(result + " " + reminder);
                    else
                        System.out.println(reminder + " " + result);
                else if (((n-max) % min) == 0)
                    if (x == min)
                        System.out.println(((n-max) / min)+" "+"1");
                    else
                        System.out.println("1"+" "+((n-max) / min));
                else
                    System.out.println("-1");
            }
        }


        sc.close();
    }

}