import java.util.Scanner;

/**
 * Created by AMK on 8/11/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            if (scanner.nextInt() == 1) {
                String line = scanner.next();
                char symbol = line.charAt(0);
                int ans = 1;
                for (int j = 1; j < line.length(); j++) {
                    if (line.charAt(j) == symbol) {
                        ans++;
                    } else {
                        System.out.print(symbol);
                        if (ans != 1){
                            System.out.print(ans);
                        }
                        ans = 1;
                        symbol = line.charAt(j);
                    }

                }
                System.out.print(symbol);
                if (ans != 1){
                    System.out.print(ans);
                }
            } else {
                String line = scanner.next();
                char symbol = line.charAt(0);
                String ss = "1";
                for (int j = 1; j < line.length(); j++) {
                    if (Character.isDigit(line.charAt(j))) {
                        ss = "";
                        while (j != line.length() && Character.isDigit(line.charAt(j))){
                            ss += line.charAt(j);
                            j++;
                        }
                        for (int k = 0; k < Integer.parseInt(ss); k++) {
                            System.out.print(symbol);
                        }
                        j--;
                        ss = "0";
                    }else{
                        if (!ss.equals("0")){
                            System.out.print(symbol);
                        }
                        symbol = line.charAt(j);
                        ss = "1";
                    }
                }
                for (int k = 0; k < Integer.parseInt(ss); k++) {
                    System.out.print(symbol);
                }
            }
            System.out.println();
        }

    }
}
