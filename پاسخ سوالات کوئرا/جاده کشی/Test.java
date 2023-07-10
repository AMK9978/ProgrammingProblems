import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = n / 2; 
        int col = (n % 2) + row;

        System.out.print((row + 1) * (col + 1));
        sc.close();
        
    }
}