import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count=0,sum=0;

        for (int i = 1; i <= num; i++) {
            for (int j=1;j<=i;j++) {
                if (i % j == 0) {
                    count++;
                    sum += j;
                }
            }
        }
        System.out.print(count);
        System.out.println(" "+sum);

    }
}
