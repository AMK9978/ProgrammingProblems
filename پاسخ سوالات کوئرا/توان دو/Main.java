import java.util.Scanner;
 
public class Main {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int tavan = 2;
 
        for(int i = 0 ; i <= n ; i++) {
            tavan *= 2;
            if(tavan >= n) {
                System.out.println(tavan);
                break;
            }
        }
    }
}