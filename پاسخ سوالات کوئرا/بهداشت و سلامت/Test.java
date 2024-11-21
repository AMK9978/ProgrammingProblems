

import java.util.*;

public class Test{

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int def = 0;
        if (n == 0)
            System.out.println(20);
        else if (n == 7)
            System.out.println(x);
        else {
            def =  x - n;
            if (def < 0)
                System.out.println(0);
            else
                System.out.println(x - n);

        }
        

    }
    
}

