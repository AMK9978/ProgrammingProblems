import java.util.Scanner;

public class FizzBuzz {

    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        int inputX = scanner.nextInt();
        int inputY = scanner.nextInt();
        int inputN = scanner.nextInt();

        for ( int i = 1; i < inputN + 1; i++ ) {
            boolean isFizz = i % inputX == 0;
            boolean isBuzz = i % inputY == 0;

            System.out.println( isFizz && isBuzz ? "FizzBuzz" : isFizz ? "Fizz" : isBuzz ? "Buzz" : i + "" );
        }
    }
}
