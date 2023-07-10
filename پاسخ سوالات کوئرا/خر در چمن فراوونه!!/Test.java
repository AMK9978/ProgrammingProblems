import java.util.Scanner;

class Test {
  
  public static void main(String[] args) {
    
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt() , b = sc.nextInt() , l = sc.nextInt(), sum = 0;
        for (int i = 1; i <=l ; i++) {
            if (i%2 == 0)
                sum+=b;
            else
                sum+=a;
        }
        System.out.println(sum);     

        sc.close();
    
  }
  
  
}


 