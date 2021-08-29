import java.util.Scanner;
 
public class Main {
 
    public static Scanner sc;
 
 
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
 
        for (int i = 1; i <= number / 2;i++) {
            if(count == number) {
                count += i;
            }
        }
 
        if(count == number) {
            System.out.println("YES");
        }
        else {
            System.out.println("No");
        }
    }
 
}