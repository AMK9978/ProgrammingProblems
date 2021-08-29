import java.util.Scanner;
 
public class Main {
 
    public static Scanner sc;
 
 
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp_n = n;
        int b=0;
        int count;
        int counter = 1;
 
        while (n > 0) {
            b += n % 10;
            n = n / 10;
        }
 
        int i=temp_n;
        int j;
        while(true) {
            i++;
            count = 0;
            for (j=1;j <= i;j++)
                if(i%j==0)
                    count++;
 
            if(count==2 && counter==b) {
                System.out.println(i);
                break;
            }
            else if(count==2)
                counter++;
        }
 
    }
 
}