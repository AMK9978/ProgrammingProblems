import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> orginal = new ArrayList<String>();
        List<String> arr = new ArrayList<String>();
        String str = "";
        int n = 0;

        orginal.add(0, "shanbe");
        for(int i=1; i<6; i++)
            orginal.add(i, i+"shanbe");
        orginal.add(6, "jome");


        int one = sc.nextInt();
        for(int i=0; i<one; i++){
            str = sc.next();
            arr.add(str);
        }

        int two = sc.nextInt();
        for(int i=0; i<two; i++){
            str = sc.next();
            arr.add(str);
        }

        int three = sc.nextInt();
        for(int i=0; i<three; i++){
            str = sc.next();
            arr.add(str);
        }

        for(int i=0; i<orginal.size(); i++){
            for(int j=0; j<arr.size(); j++){
                if(orginal.get(i).equals(arr.get(j)))
                    break;
                if(j==arr.size()-1)
                    if(!orginal.get(i).equals(arr.get(j)))
                        n += 1;
            }
        }
        System.out.println(n);
    }
}