import java.util.*;
import java.lang.Math;

class Test {
  
 public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String input = sc.nextLine();
	char [] str = new char[20];	
	for(int i=0;i<input.length();i++){
	  str[i] = input.charAt(i);
	}
	int count=0;
    
	for(int i=0;i<input.length();i++){
	 if ((str[i] == 'T') | (str[i] == 'D') | (str[i] == 'L') | (str[i] == 'F'))	  
		count++;

	}
   	int abs = (int) Math.pow(2,count);
		System.out.println(abs);	

	}
  
}

