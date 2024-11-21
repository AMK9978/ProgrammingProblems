import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int xt = in.nextInt(), yt = in.nextInt(), xp = in.nextInt(), yp = in.nextInt();


      
        if ( (xt>=xp) & (yt>=yp))
            System.out.println("yes");
        else 
              System.out.println("no");
 
        
    }
}