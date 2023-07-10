import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() , m = sc.nextInt(), sum=0;
        sum = (n+m - 1) / m;
        System.out.println(sum);
        sc.close();
    }
    }