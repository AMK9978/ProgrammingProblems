import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
 
public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
 
        int number;
        String result = "";
        int counter = 0;
 
        while (true) {
            number = sc.nextInt();
 
            if(number == 0)
                break;
 
            if(counter==0)
                result = String.valueOf(number);
            else
                result = String.valueOf(number) + '\n' + result;
 
            counter++;
        }
 
        System.out.println(result);
    }
}