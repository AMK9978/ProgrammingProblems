import java.util.Scanner;
 
class Main {
 
    static Scanner sc;
 
    public static void main(String[]args){
        sc = new Scanner(System.in);
        int N, N1;
        N = sc.nextInt();
        N1 = sc.nextInt();
        ShowFibNth(N, N1);
    }
 
    public static void ShowFibNth(int N, int N1) {
        if(N==0)
            return;
        System.out.println(N);
        int new_n = N1 - N;
        ShowFibNth(new_n, N);
    }
 
}