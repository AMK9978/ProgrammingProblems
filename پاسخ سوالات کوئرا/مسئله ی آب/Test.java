import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong() , b = sc.nextLong(), c=sc.nextLong() , d = sc.nextLong() , e =sc.nextLong() , f=sc.nextLong();

        if ((a >= d) && (b>=e))
            System.out.println("zende mimuni");
        else if (a>=e && b>=d)
            System.out.println("zende mimuni");
        else if (a>=f && b>=e)
            System.out.println("zende mimuni");
        else if (a>=e && b>=f)
            System.out.println("zende mimuni");
        else if (a>=f && b>=d)
            System.out.println("zende mimuni");
        else if (a>=d && b>=f)
            System.out.println("zende mimuni");
        else
            System.out.println("dari mimiri");
        sc.close();
    }
    }