import java.util.Scanner;
 
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num = sc.nextInt();
        String currentName;
        int tempCount=0;
        int counter=0;
        int maxCounter=0;
        int tempLength=0;
        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y' ,'z'};
        for (int i=0; i<=num; i++)
        {
            currentName = sc.nextLine();
            tempLength = currentName.length();
            for(int j=0; j<=25;j++)
            {
                tempCount = currentName.replace(String.valueOf(ch[j]), "").length();
                if(tempCount==tempLength)
                    continue;
                counter++;
                tempCount=0;
            }
            if(counter>maxCounter)
                maxCounter = counter;
            counter=0;
        }
        System.out.println(maxCounter);
    }
}