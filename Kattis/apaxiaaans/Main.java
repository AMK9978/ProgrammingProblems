import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        List<String> workSimplified = new ArrayList<>();
        workSimplified.add(String.valueOf(word.charAt(0)));
        int lastIndex = 0;

        for (int i = 1; i < word.length(); i++) {
            if (!(workSimplified.get(lastIndex).equals(String.valueOf(word.charAt(i))))) {
                workSimplified.add(String.valueOf(word.charAt(i)));
                lastIndex++;
            }
        }
        for (String s : workSimplified) {
            System.out.print(s);
        }
        System.out.println("");
    }
}
