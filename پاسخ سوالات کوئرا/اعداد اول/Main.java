import java.util.Scanner;
 
public class Main {
 
    public static Scanner sc;
 
 
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int counter = 0;
 
        if(a < 1 || b > 10000)
            return;
 
        for(int i=a; i<=b;i++) {
            for (int j=1; j<=i; j++)
            {
                if(i%j==0)
                    counter++;
            }
            if(counter==2)
                System.out.println(i);
            counter=0;
        }
 
 
    }
 
}