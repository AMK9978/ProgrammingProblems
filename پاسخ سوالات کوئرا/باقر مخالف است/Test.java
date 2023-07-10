import java.util.Scanner;

/**
 * @Author: Quera College
 */
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int []cntx=new int[10];
        int extraX=x;
        while(extraX>0)
        {
            cntx[extraX%10]++;
            extraX/=10;
        }
        for(int y=x+1;y<=1000*1000;y++)
        {
            int []cnty=new int[10];
            int extraY=y;
            while(extraY>0)
            {
                cnty[extraY%10]++;
                extraY/=10;
            }
            boolean equal=true;
            for(int i=0;i<=9;i++)
                if(cntx[i]!=cnty[i])
                {
                    equal=false;
                    break;
                }
            if(equal)
            {
                System.out.println(y);
                return ;
            }
        }
        System.out.println(0);

        sc.close();
    }

}