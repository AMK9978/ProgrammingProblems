

import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    
    int b = 1, p = 0;
    
    if (k %2 == 0 )
    	System.out.println("Bala Barare");
    else if (k %2 != 0)
      System.out.println("Payin Barare");
    
  }
  
}
