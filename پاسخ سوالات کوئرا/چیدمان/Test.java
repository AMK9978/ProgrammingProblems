import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // number of coin columns
        int [] coins = new int[n];
        int sum=0, count=0 , avg=0;
        for (int i = 0; i < n; i++) {
           coins[i] = sc.nextInt();       // the height of columns
        }
        for (int i = 0; i < coins.length; i++) {
            sum += coins[i];
        }
        avg = sum/n;
        for(int i = 0; i < n; i++){
            if(coins[i] < avg)
            while (coins[i] < avg){
                coins[i]+=1;
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}