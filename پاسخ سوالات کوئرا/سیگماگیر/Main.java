1
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
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
import java.util.Scanner;
import java.lang.Math.*;
 
public class Main {
 
    public static Scanner sc;
 
 
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        int temp = 0;
 
        if(n < 0 ||m > 10)
            return;
 
        for (int i = -10; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(j == 0)
                    continue;
 
                temp = (int)java.lang.Math.pow(i + j, 3);
                sum += temp / (int)java.lang.Math.pow(j, 2);
            }
        }
 
        System.out.println(sum);
 
 
    }
 
}