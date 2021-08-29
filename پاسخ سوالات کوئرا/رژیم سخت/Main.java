import java.util.Scanner;
 
class Main {
 
    static Scanner sc;
 
    public static void main(String[]args){
        sc = new Scanner(System.in);
        String string = sc.nextLine();
 
        int r = 0;
        int g = 0;
        int y = 0;
 
        for (char ch : string.toCharArray()) {
            if(String.valueOf(ch).equals("R") || String.valueOf(ch).equals("r"))
                r++;
            else if(String.valueOf(ch).equals("G") || String.valueOf(ch).equals("g"))
                g++;
            else if(String.valueOf(ch).equals("Y") || String.valueOf(ch).equals("y"))
                y++;
        }
 
        if( (y == string.length() || r == string.length()) || (r >= 3) || (r >= 2 && y >= 2) || (y==4 && r==1) ) {
            System.out.println("nakhor lite");
        } else {
            System.out.println("rahat baash");
        }
    }
 
}