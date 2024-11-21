import java.util.Scanner;

public class Main {

    int n ;
    int [][] a;
    int [] x;
    int sum = 0;
    int min = Integer.MAX_VALUE;
    int [] ans;
    public Main(int n, int [][] a) {
        this.a = a;
        this.n = n;
        x = new int [n];
        ans = new int [n];
        work_selection(0);
        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }
    }

    void work_selection(int i){
        if(i == n){
            min = sum;
            for (int j = 0; j < n; j++) {
                ans[j] = x[j];
            }
        }
        else{
            for (int k = 0; k < n; k++) {
                if(is_ok(k, i)){
                    x[i] = k;
                    sum += a[i][k];
                    work_selection(i + 1);
                    sum -= a[i][k];
                }
            }
        }

    }

    boolean is_ok(int k, int i){
        for (int j = 0; j < i; j++) {
            if(x[j] == k)
                return false;
        }
        if(sum + a[i][k] > min)
        return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a [][] = new int [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        new Main(n, a);
    }
}