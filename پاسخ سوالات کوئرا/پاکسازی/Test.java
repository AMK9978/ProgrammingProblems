import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        String street = new String();
        n = scanner.nextInt();
        while(!scanner.hasNextLine());
        scanner.nextLine();
        street = scanner.nextLine();
        int s , t;
        s = scanner.nextInt();
        t = scanner.nextInt();
        int j =0 ;
        int result = 0;
        for(int i = (s<t ? s : t)  ; i < (s<t ? t : s); i++){
            if(street.charAt(i) == 'H'){
                j++;
            }
            else{
                result += judge(j);
                j =0;
            }
        }
        System.out.println(result);
    }

    public static int judge(int count){
        int x = 1;
        int res = 0;
        while (count > 0) {
            while (x <= count) {
                x *= 2;
            }
            count -= (x/2);
            x =1;
            res++;
        }
        return res;
    }
}
