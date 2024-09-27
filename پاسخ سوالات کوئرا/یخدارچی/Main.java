import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

	// Better Solution

    int T = sc.nextInt();

    
    if(T > 100){
      System.out.println("Steam");
    } else if (T < 0){
      System.out.println("Ice");
    }else
      System.out.println("Water"); 
  }
  
}