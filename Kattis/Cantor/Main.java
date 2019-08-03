import java.util.*;

/**
 * Created by AMK on 8/2/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String command = scanner.nextLine().split(" ")[0];
            if (command.equals("END"))
                break;
            Double x = Double.parseDouble(command);
            if (x == 0 || x == 1) {
                System.out.println("MEMBER");
                continue;
            }
            x = x - x.intValue();
            x = x * 1000000;
            if (Calc(x)) {
                System.out.println("MEMBER");
            } else {
                System.out.println("NON-MEMBER");
            }
        }
    }

    private static boolean Calc(Double x) {
        int y = x.intValue();
        HashSet<Integer> hashSet = new HashSet<>();
        while (!hashSet.contains(y)) {
            hashSet.add(y);
            y *= 3;
            if (y / 1000000 == 1) {
                return false;
            }
            y = y % 1000000;
        }
        return true;
    }

}