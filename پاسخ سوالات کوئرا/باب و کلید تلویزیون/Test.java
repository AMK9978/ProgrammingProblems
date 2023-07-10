import java.util.*;

public class Test {
	
	
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() , x = sc.nextInt(), k = sc.nextInt();
        String[] channelNames = new String[n+1];
        int i=1;
        while(i<=n){
            channelNames[i] = sc.next();
            i++;
        }
        for(i=1;i<=k;i++){
            if (x < n)
                x = x + 1;
            else if (x == n)
                x = 1;

        }
        System.out.println("\n"+channelNames[x]);
        sc.close();
	}
	
}