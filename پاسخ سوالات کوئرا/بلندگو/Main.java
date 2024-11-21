import java.util.*;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        char [] chars = new char[n.length()];

        for(int i=0;i<n.length();i++){
            chars[i] = n.charAt(i);
        }
	System.out.println(n);
        for(int i=1;i<n.length();i++){
            for(int j=0;j<i;j++){
                chars[j] = chars[i];
            }
            for(int k=0;k<n.length();k++){
                System.out.print(chars[k]);
            }
            System.out.println();
        }
        
    }
}