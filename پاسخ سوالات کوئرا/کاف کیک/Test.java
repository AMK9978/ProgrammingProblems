

import java.util.*;

public class Test{

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() , k = sc.nextInt();
        int [] c = new int [n];
        int firstElement = 0, lastElement = 0;
        int max = 0 , min = 100 , max2 = 0, min2 = 100;
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
            firstElement = c[0];
            lastElement = c[n-1];
            if (c[i] > max)
                max = c[i];
            else if (c[i] < min)
                min = c[i];

        }

        if (k == 1)
            System.out.println(max);
        else {
            if (k == 2)
                System.out.println(Math.min(firstElement, lastElement));
            else if (k >= 3)
                System.out.println(min);
        }
        

    }
    
}

