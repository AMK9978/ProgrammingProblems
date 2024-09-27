import java.util.Scanner;

public class Test4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        for (int i = 1; i <= n/3; i++) {
            ans = ans + ((n-3*i)/2) - Math.max(0 , (n/2) - (2*i)+1) + 1;
        }
        System.out.println(ans);

        sc.close();
    }

}