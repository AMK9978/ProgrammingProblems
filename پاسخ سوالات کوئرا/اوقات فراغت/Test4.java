import java.util.Scanner;

public class Test4 {
    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() , m = sc.nextInt();
        sc.nextLine();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {

                str[i] = sc.nextLine();     //getting strings

        }

        String s = sc.nextLine();       // getting desire string
        int size = s.length();
        int count = 0 , difference = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m - size; j++) {
                difference = 0;
                for (int k = 0; k <size ; k++) {
                    if (s.charAt(k) != str[i].charAt(k+j))
                        difference = 1;
                }
                if (difference == 0)
                    count++;
            }
        }


        for (int i = 0; i <= n-size; i++) {
            for (int j = 0; j < m; j++) {
                difference = 0;
                for (int k = 0; k < size; k++) {
                    if (s.charAt(k) != str[i+k].charAt(j))
                        difference = 1;
                }
                if (difference == 0)
                    count++;
            }

        }

        System.out.println(count);


        sc.close();
    }

}