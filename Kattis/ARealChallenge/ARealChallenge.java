import java.util.Scanner;

public class ARealChallenge {

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        long area = Long.parseLong(scanner.next());
        System.out.println(Math.sqrt(area) * 4);
    }
}
