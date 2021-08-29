import java.util.Scanner;
 
public class Main {
 
    public static Scanner sc;
 
 
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int num = sc.nextInt();
 
        int arr[] = new int[101];
        arr[0] = 1;
        arr[1] = 2;
        for (int i = 2; i <= 100; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
 
        int j = 0;
        for (int i = 1; i <= num; i++) {
            if(i == arr[j])
            {
                System.out.print("+");
                j++;
            }
            else
                System.out.print("-");
        }
 
    }
 
}