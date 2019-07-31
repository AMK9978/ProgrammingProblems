import java.util.*;

/**
 * Created by AMK on 7/30/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = 0;
        while (true) {
            int N = scanner.nextInt();
            if (N == 0) {
                break;
            }
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                int x = scanner.nextInt();
                if (x != 0){
                    arrayList.add(x);
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                if (i != arrayList.size() - 1)
                    System.out.print(arrayList.get(i) + " ");
                else
                    System.out.println(arrayList.get(i));
            }
            if (arrayList.size() == 0){
                System.out.println(0);
            }
            k++;
        }
    }
}
