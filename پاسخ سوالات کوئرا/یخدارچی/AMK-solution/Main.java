import java.util.Scanner;

public class Main {

    public static Scanner sc;


    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int T = sc.nextInt();

        if(T < -273 || T >= 6000)
            return;

        if(T > 100)
            System.out.println("Steam");
        else if(T < 0)
            System.out.println("Ice");
        else
            System.out.println("Water");

    }

}