import java.util.Scanner;

public class main  {



    public static void main(String []args){

        String T,A,X,M,N;
        Scanner scanner = new Scanner(System.in);
        T = "*****oo*oooo*oo";
        A = "oo*ooo***o*ooo*";
        X = "*ooo*oo*oo*ooo*";
        M = "**o***o*o**ooo*";
        N = "*ooo**o*o**ooo*";


        String S1 = scanner.next();
        String S2 = scanner.next();
        String S3 = scanner.next();

        String arr1[] = new String[S1.length()/5];
        String arr2[] = new String [S2.length()/5];
        String arr3[] = new String[S3.length()/5];
        int j=0;
        StringBuffer stringBuffer1 = new StringBuffer(S1);
        StringBuffer stringBuffer2 = new StringBuffer(S2);
        StringBuffer stringBuffer3 = new StringBuffer(S3);
        for (int i=0; i<S1.length();i+=5){
            arr1[j] = stringBuffer1.substring(i,i+5);
            j++;
        }
        j = 0;


        for (int i=0; i<S2.length();i+=5){
            arr2[j] = stringBuffer2.substring(i,i+5);
            j++;
        }

        j = 0;

        for (int i=0; i<S3.length();i+=5){
            arr3[j] = stringBuffer3.substring(i,i+5);
            j++;
        }

        j = 0 ;

        String f[] = new String[arr1.length];

        for (int i =0 ;i<arr1.length;i++){
            f[i] = arr1[i]+arr2[i]+arr3[i];

        }

        for (int i =0 ;i<f.length;i++){
            if (f[i].equals(T))
                System.out.print("T");
            else if(f[i].equals(A))
                System.out.print("A");
            else if (f[i].equals(X))
                System.out.print("X");
            else if (f[i].equals(M))
                System.out.print("M");
            else if (f[i].equals("*ooo**o*o**ooo*"))
                System.out.print("N");
            else
                System.out.print(f[i]);
        }

    }


}
