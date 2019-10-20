import java.util.Arrays;
import java.util.Scanner;

public class ABC {

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split( " " );
        String letters = scanner.nextLine();

        int[] numbers = new int[data.length];
        for ( int i = 0; i < 3; i++ ) {
            numbers[i] = Integer.parseInt( data[i] );
        }

        Arrays.sort( numbers );
        for ( int i = 0; i < letters.length(); i++ ) {
            if ( letters.charAt( i ) == 'A' )
                System.out.print( numbers[0] + " " );
            else if ( letters.charAt( i ) == 'B' )
                System.out.print( numbers[1] + " ");
            else if ( letters.charAt( i ) == 'C' )
                System.out.print( numbers[2] + " " );
        }
    }
}
