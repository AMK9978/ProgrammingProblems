import java.util.Scanner;
 
public class Main {
 
    public static Scanner sc;
 
 
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        if(n < 1 || n > 100)
            return;
 
        for(int i=1; i <=n; i++) {
            for (int j=1; j<=n; j++) {
                System.out.print(i*j);
                System.out.print(" ");
            }
            System.out.println("");
        }
 
    }
 
}