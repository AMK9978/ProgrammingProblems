
import java.util.Scanner;

public class Test2 {
        // مجید و ماژیک هاش
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] color = new int[101];
        int [] counter = new int[101];
        int max_color = 0;

        for (int i = 0; i < n; i++) {
            color[i] = sc.nextInt();
            counter[color[i]] = counter[color[i]] + 1;
            if (color[i] > max_color){
                max_color = color[i];
            }
        }

        int answer = -1;
        for (int i = 1; i <= max_color; i++) {
            if (counter[i] > 0)
                if (answer == -1 || counter[answer] > counter[i] || (counter[answer] == counter[i] && i < answer) )
                    answer = i;
        }



        System.out.println(answer);



        sc.close();
    }
}
