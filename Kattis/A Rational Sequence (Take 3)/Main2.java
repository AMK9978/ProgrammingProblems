import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int P = scanner.nextInt();
        for (int i = 0; i < P; i++) {
            int j = scanner.nextInt();
            long n = scanner.nextLong();
            System.out.print(j+" ");
            getN(n);
        }
    }

    private static void getN(long i) {
        String str = Long.toBinaryString(i);
        int p = 1,q = 1;
        for (int j = 1; j < str.length(); j++) {
            if (str.charAt(j) == '0'){
                //go left:
                q = p + q;
            }else{
                //go right:
                p = p + q;
            }
        }
        System.out.println(p+"/"+q);
    }
}
