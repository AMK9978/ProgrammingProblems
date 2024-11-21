import java.util.*;

/**
 * @Author: Stackoverflow
 */

public class Test4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String e = sc.nextLine();
        if (nextHighest(e) != null)
            System.out.println(nextHighest(e));
        else
            System.out.println(0);

        sc.close();
    }

    public static String nextHighest(String e) {
        char[] digits = e.toCharArray();

        int i = digits.length - 2;

        NavigableSet<String> set = new TreeSet<>();
        for (; i >= 0; i--) {


            char[] shortList = Arrays.copyOfRange(digits, i, digits.length);


            String originalTail = new String(shortList);

            permute(shortList, digits.length - i, set);


            String minTail = set.higher(originalTail);

            if (minTail != null) {
                String head =
                        new String(Arrays.copyOfRange(digits, 0, i));
                return String.format("%s%s", head, minTail);
            }
            // clear the set and try a larger ending.
            set.clear();
        }
        // no success, return the original value.
        return null;
    }

    public static void permute(char[] elements, int length,
                               Set<String> vals) {
        if (length == 1) {
            vals.add(new String(elements));
        } else {
            for (int i = 0; i < length; i++) {
                permute(elements, length - 1, vals);
                if (length % 2 == 1) {
                    swap(elements, 1, length - 1);
                } else {
                    swap(elements, i, length - 1);
                }
            }
        }

    }

    public static void swap(char[] list, int i, int j) {
        char temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}
    