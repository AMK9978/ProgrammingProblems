import java.util.Scanner;
 
public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
 
        String string = sc.nextLine();
        String numYear = "";
        String numMonth = "";
 
        int counter = 0;
 
        for (char ch : string.toCharArray()) {
            counter++;
            if(counter <= 2) {
                numYear = numYear + Character.toString(ch);
            } else {
                numMonth = numMonth + Character.toString(ch);
            }
        }
 
        System.out.println("saal:" + numYear);
        System.out.println("maah:" + numMonth);
    }
}