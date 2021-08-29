import java.util.Scanner;
 
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num = sc.nextInt();
        System.out.print("W");
        for (int i=1; i<=num; i++)
            System.out.print("o");
        System.out.print("w!");
    }
}