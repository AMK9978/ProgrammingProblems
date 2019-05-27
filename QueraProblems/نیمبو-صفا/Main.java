import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int arr2[] = new int[n + 1];
        int arr[] = new int[n + 1];
        ArrayList<Long> arrayList = new ArrayList<>();
        arrayList.add((long) 0);
        for (int i = 0; i < q; i++) {
            int command = scanner.nextInt();
            if (command == 1) {
                int number = scanner.nextInt();
                arrayList.add(arrayList.get(arrayList.size() - 1) + number);
            } else {
                int I = scanner.nextInt();
                int j = scanner.nextInt();
                arr2[I] += j;
                System.out.println(arrayList.get(arr2[I]) - arrayList.get(arr[I]));
                arr[I] += j;
            }
        }

    }
}