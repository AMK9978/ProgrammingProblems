import java.util.Scanner;
/**
 * @Author: Mohammadyar Barandov
 *
 */
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p1 = sc.next(); String p1Door = sc.next();
        String p2 = sc.next(); String p2Door = sc.next();
        String p3 = sc.next(); String p3Door = sc.next();
        String p4 = sc.next(); String p4Door = sc.next();

        char one = p1Door.charAt(0);
        char two = p2Door.charAt(0);
        char three = p3Door.charAt(0);
        char four = p4Door.charAt(0);

        if (one == 'U') {
            if ((two == three & two == four) | (three == four))
                System.out.println(p3);
            else
                System.out.println(p2);
        }
        else if (two == 'U'){
            if (one == three & three == four  | three == four)
                System.out.println(p3);
            else
                System.out.println(p1);
        }
        else if (three == 'U'){
            if (one == two & two == four  | one != two)
                System.out.println(p2);
            else
                System.out.println(p1);
        }
        else if (four == 'U'){
            if (one == two & two == three   | two == three)
                System.out.println(p2);
            else System.out.println(p1);
        }

        sc.close();
    }

}