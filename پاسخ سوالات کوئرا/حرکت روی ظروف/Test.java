import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat() , b = sc.nextFloat(), c=sc.nextFloat() , avg;

        avg = (a+b+c)/3;
        if ((a == b) && (b==c))
            System.out.println(0);
        else if (a==avg || b==avg || c==avg)
            System.out.println(1);
        else
            System.out.println(2);
        sc.close();
    }
    }

 