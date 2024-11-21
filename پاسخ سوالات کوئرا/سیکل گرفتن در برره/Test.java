import java.util.Scanner;
/**
 * @Author: Mohammadyar Barandov
 *
 */
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String ans = sc.nextLine();
        int k = 0, n = 0, sh = 0;
        for (int i = 0; i < N; i++) {
            if (i % 6 == 1) {
                if (ans.charAt(i) == '3') {
                    k++;
                } else if (ans.charAt(i) == '2') {
                    n++;
                }
            } else if (i % 6 == 2) {
                if (ans.charAt(i) == '3') {
                    n++;
                } else if (ans.charAt(i) == '1') {
                    k++;
                }
            } else if (i % 6 == 3) {
                if (ans.charAt(i) == '1') {
                    k++;
                    n++;
                }
            } else if (i % 6 == 4) {
                if (ans.charAt(i) == '2') {
                    k++;
                    n++;
                }
            } else if (i % 6 == 5) {
                if (ans.charAt(i) == '3') {
                    n++;
                } else if (ans.charAt(i) == '2') {
                    k++;
                }
            } else if (i % 6 == 0) {
                if (ans.charAt(i) == '3') {
                    k++;
                } else if (ans.charAt(i) == '1') {
                    n++;
                }
            }
            if ((i%4 == 0 || i%4 == 2)&& ans.charAt(i)=='2')
                sh++;
            else if (i%4 == 1 && ans.charAt(i)=='1')
                sh++;
            else if (i%4 == 3 && ans.charAt(i) == '3')
                sh++;
        }
        int max = Math.max(sh, Math.max(n, k));
        System.out.println(max);
        if (k==max)
            System.out.println("keyvoon");
        if (n==max)
            System.out.println("nezam");
        if (sh==max)
            System.out.println("shir farhad");
        sc.close();
    }

}