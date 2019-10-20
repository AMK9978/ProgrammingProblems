import java.util.Scanner;

public class Bijele {

    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );

        int[] output = new int[]{ 1, 1, 2, 2, 2, 8 }; //numbers of kings, queens, rooks, bishops, knights and pawn
        String[] data = scanner.nextLine().split( " " );

        for ( int i = 0; i < output.length; i++ ) {
            output[i] -= Integer.parseInt( data[i] );
            System.out.print(output[i] + " ");
        }
    }
}
