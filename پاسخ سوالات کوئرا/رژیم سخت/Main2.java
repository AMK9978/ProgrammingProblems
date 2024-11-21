import java.util.Scanner;

public class Main2{

	public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
    char [] string_chars = new char[5];
    
     for(int i=0;i<5;i++){
      string_chars[i] = str.charAt(i);
    }

    int countR=0,countY=0,countG=0;
    
    for(int i=0;i<string_chars.length;i++){
      if(string_chars[i] == 'R'){
        countR++;
      }else if (string_chars[i] == 'Y'){
        countY++;
      }else
        countG++;
    }
    
    if( (countR >=3) | (countR>=2 & countY>=2) | (countG==0) ){
      System.out.println("nakhor lite");
    }else
      System.out.println("rahat baash");
		
	}	
}