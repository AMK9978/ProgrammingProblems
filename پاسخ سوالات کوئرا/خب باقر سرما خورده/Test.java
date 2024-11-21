import java.util.Scanner;


/**
 * @Author: Mohammadyar Barandov
 *
 */

public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] strings = new String[6];
        for (int i = 1; i <= 5; i++) {
            strings[i] = input.nextLine();
        }
        int nf=0;
        for (int i = 1; i <= 5; i++) {
            if (strings[i].contains("HAFEZ") | strings[i].contains("MOLANA"))
                System.out.print(i+" ");
            else nf++;
        }
        if (nf==5)
            System.out.println("NOT FOUND!");

        input.close();
    }

}