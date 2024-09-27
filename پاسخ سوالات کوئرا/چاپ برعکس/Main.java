import java.util.Scanner;

// Simpler solution

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] num = new int[1000];
        int i=0;

        int input;

        while ( (input = sc.nextInt())!=0 ){

            num[i] = input;
            i++;
        }

            for (int j=i;j>=0;j--) {
                    if (num[j]==0)
                        continue;
                System.out.println(num[j]);

        }


    }
}