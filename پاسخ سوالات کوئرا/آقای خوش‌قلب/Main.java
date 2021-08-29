
2
3
4
5
6
7
8
9
10
11
12
13
14
import java.util.Scanner;
 
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num = sc.nextInt();
        if(num>100)
            num = 100;
        else if(num<0)
            num = 0;
        for (int i=1; i<=num; i++)
            System.out.println("man khoshghlab hastam");
    }
}