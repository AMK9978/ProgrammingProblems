import java.util.Collections;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int h = Integer.parseInt(line.split(" ")[0]);
        String instructions = "";
        if (line.split(" ").length > 1) {
            instructions= line.split(" ")[1];
        }
        long pivot = 1;
        for (int i = 0; i < instructions.length(); i++) {
            if (instructions.charAt(i) == 'L'){
                pivot = 2*pivot;
            }else if (instructions.charAt(i) == 'R'){
                pivot = 2*pivot + 1;
            }
        }
        long ans = (((long)Math.pow(2,h+1)) - pivot);
        System.out.print(ans);
    }
}
