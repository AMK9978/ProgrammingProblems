import java.util.Scanner;

public class Main{

	public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   int k = sc.nextInt();
	   int i=0,sum=0;

	    while((i+1)<=k){
      		sum+=i+1;
      		i++;
   	 }
    	  System.out.println(sum);
		
	}	
}