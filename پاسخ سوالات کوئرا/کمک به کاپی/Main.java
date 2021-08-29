import java.util.Scanner;
 
public class Main {
 
    public static Scanner sc;
 
 
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] inp_arr = inp.split(" ");
 
 
        for (int i = 1; i <= Integer.parseInt(inp_arr[0]);i++)
            System.out.print("copy of ");
 
        System.out.print(inp_arr[1]);
    }
 
}