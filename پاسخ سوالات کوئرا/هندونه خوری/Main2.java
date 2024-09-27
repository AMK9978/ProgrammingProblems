
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n;
        int [] w = new int[n+1];
        for (int i = 1; i <=n ; i++) {
            w[i] = sc.nextInt();
        }
        while (k!=1){
            for (int i = 1; i <=n; i++) {
                for (int j = i+1; j <=n; j++) {
                    if (w[i]!=0) {
                        if (w[i] < w[j]) {
                            w[i] = 0;
                            k--;
                        } else {
                            w[j] = 0;
                            k--;
                        }
                    }
                }
            }
        }
        for (int i = 1; i < w.length; i++) {
            if (w[i]!=0){
                System.out.println(i);
                break ;
            }

        }

    }
}
