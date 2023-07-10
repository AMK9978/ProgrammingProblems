

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of rows
        int m = sc.nextInt();   // number of columns

        int [][] table = new int[n+1][m+1];     // for showing from index 1 instead of index 0

        int k = sc.nextInt();       // number of bombs and lines of bombs coordinates

        for (int i = 0; i < k; i++) {      // For taking coordinates and insert '*' in sign of bomb
           int r = sc.nextInt();
           int c = sc.nextInt();

            table[r][c] = '*';

        }

        for (int i = 1; i < n+1; i++) {     // For showing the table from index 1 instead of index 0
            for (int j = 1; j < m+1; j++) {
                if (table[i][j]==42)        // 42 is the ASCII for "*" character
                    System.out.print("*");
                else
                    countMines(i,j,table);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    private static void countMines(int i, int j, int[][] table){
        int counter=0;
        for (int dx=-1; dx<=1; dx++)    
        {
            for (int dy=-1; dy<=1; dy++)
            {
                if (dx == 0 && dy == 0) 
                {
                    continue;
                }
                int nx = i+dx;
                int ny = j+dy;
                if (!isValid(nx, ny,table))
                {
                    continue;
                }
                if (table[nx][ny] == 42)
                {
                    counter++;
                }
            }
        }
        System.out.print(counter);
    }

    private static boolean isValid(int i, int j, int[][] table)
    {
        if (i < 0 || i >= table.length) return false;
        return j >= 0 && j < table[i].length;
    }
}
