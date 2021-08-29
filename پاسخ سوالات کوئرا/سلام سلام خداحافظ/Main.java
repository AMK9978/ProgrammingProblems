import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String n = sc.nextLine();
        int nn = Integer.parseInt(n);
        String myInput = sc.nextLine();
        String[] splited = myInput.split("\\s+");
 
        if(nn < 0 || nn > 50)
            return;
 
        for (int i = 2; i<=nn; i++) {
            for (int j = i - 1; j>=1; j--) {
                System.out.println(splited[i - 1] + ": salam " + splited[j - 1] + "!");
            }
        }
 
        for (int i = 1; i<=nn; i++) {
            System.out.println(splited[i - 1] + ": khodafez bacheha!");
            for(int j = i + 1; j <= nn; j++) {
                System.out.println(splited[j - 1] + ": khodafez  " + splited[i - 1] + "!");
            }
        }
 
    }
 
}