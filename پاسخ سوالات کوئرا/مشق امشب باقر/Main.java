import java.util.Scanner;
 
public class Main {
 
    public static Scanner sc;
 
 
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
 
        if ( a + b + c != 180 )
            System.out.println("No");
        else if ( a == 0 || b == 0 || c == 0 )
            System.out.println("No");
        else if( (a + b > c) && (a + c > b) && (b + c > a) )
            System.out.println("Yes");
        else
            System.out.println("No");
    }
 
}