import java.util.Scanner;
 
public class Main {
 
    public static Scanner sc;
 
 
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        for (int i=1; i <= n; i++)
            System.out.print("*");
        System.out.println("");
 
        if(n - 2 != 0) {
            for (int i = 1; i <= n-2; i++) {
                System.out.print("*");
                for (int j=1; j <= n-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
 
        for (int i=1; i <= n; i++)
            System.out.print("*");
        System.out.println("");
 
    }
 
}