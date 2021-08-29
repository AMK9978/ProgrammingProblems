import java.util.Scanner;
 
public class Main {
 
    public static Scanner sc;
 
 
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count;
        String result = "";
        for(int i=a+1;i<b;i++)
        {
            count = 0;
            for (int j=1;j<=i;j++)
                if(i%j==0)
                    count++;
 
            if(count==2 && result.equals(""))
                result = String.valueOf(i);
            else if(count==2)
                result += "," + String.valueOf(i);
        }
 
        System.out.println(result);
 
    }
 
}