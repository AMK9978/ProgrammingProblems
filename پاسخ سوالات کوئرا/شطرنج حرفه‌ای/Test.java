import java.util.*;


class Test {
  
 public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	int [] chess = {1,1,2,2,2,8};
    int [] p = new int[6];
   
   	for(int i=0;i<6;i++){
      p[i] = sc.nextInt();
    }
   
   	for(int i=0;i<6;i++){
      if(chess[i] == p[i]){
         p[i] = 0; 
      System.out.print(p[i]+" ");
      }else{
        p[i] = chess[i] - p[i];
       System.out.print(p[i]+" "); 
      }
    }
   
		
	}
  
}

