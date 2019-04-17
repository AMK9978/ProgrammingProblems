import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int r = scanner.nextInt(); int c = scanner.nextInt();
            int n = scanner.nextInt();
            Character[][]arr = new Character[r][c];
            for (int j = 0; j < r; j++) {
                String line = scanner.next();
                for (int k = 0; k < line.length(); k++) {
                    arr[j][k] = line.charAt(k);
                }
            }
            for (int m  = 0; m < n; m++) {
                Character[][] characters = new Character[r][c];
                for (int j = 0; j < arr.length; j++) {
                    for (int k = 0; k < arr[j].length; k++) {
                        characters[j][k] = func(arr,j,k);
                    }
                }
                arr = characters;
            }
            for (Character[] anArr : arr) {
                for (Character anAnArr : anArr) {
                    System.out.print(anAnArr);
                }
                System.out.println();
            }
            if (i != t-1) {
                System.out.println();
            }
        }        
    }

    private static Character func(Character[][] arr, int j, int k) {
        if (arr[j][k] == 'R'){
            try{
                if (arr[j-1][k] == 'P'){
                    return 'P';
                }
            }catch (Exception ignored){}
            try{
                if (arr[j+1][k] == 'P'){
                    return 'P';
                }
            }catch (Exception ignored){}
            try{
                if (arr[j][k+1] == 'P'){
                    return 'P';
                }
            }catch (Exception ignored){}
            try{
                if (arr[j][k-1] == 'P'){
                    return 'P';
                }
            }catch (Exception ignored){}
            return 'R';

        }else if (arr[j][k] == 'P'){
            try{
                if (arr[j-1][k] == 'S'){
                    return 'S';
                }
            }catch (Exception ignored){}
            try{
                if (arr[j+1][k] == 'S'){
                    return 'S';
                }
            }catch (Exception ignored){}
            try{
                if (arr[j][k+1] == 'S'){
                    return 'S';
                }
            }catch (Exception ignored){}
            try{
                if (arr[j][k-1] == 'S'){
                    return 'S';
                }
            }catch (Exception ignored){}
            return 'P';

        }else{
            try{
                if (arr[j-1][k] == 'R'){
                    return 'R';
                }
            }catch (Exception ignored){}
            try{
                if (arr[j+1][k] == 'R'){
                    return 'R';
                }
            }catch (Exception ignored){}
            try{
                if (arr[j][k+1] == 'R'){
                    return 'R';
                }
            }catch (Exception ignored){}
            try{
                if (arr[j][k-1] == 'R'){
                    return 'R';
                }
            }catch (Exception ignored){}
            return 'S';
        }
    }
}
