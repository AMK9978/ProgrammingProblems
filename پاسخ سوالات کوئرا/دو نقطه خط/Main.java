import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    int x1 = sc.nextInt();
    int y1 = sc.nextInt();
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();
    
    if(x1 == x2){
      System.out.println("Vertical");
    } else if (y1 == y2){
      System.out.println("Horizontal");
    }else
      System.out.println("Try again"); 
    
  }
  
}
