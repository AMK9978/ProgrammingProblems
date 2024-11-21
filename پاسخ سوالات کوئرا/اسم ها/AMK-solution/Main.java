import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	// Better Solution

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String names;

        int [] number = new int[n];
        for (int i = 0; i < n; i++) {
            int count=0;
            names = sc.next();
            char[] chars = names.toCharArray();     
            for (int j = 0; j < names.length(); j++) {
                for (int k = j+1; k < names.length(); k++) {
                    if (chars[j] == chars[k] && chars[j] !=' ') {   
                        count++;
                        chars[k] = ' '; //Set chars[k] to ' ' to avoid printing visited character
                    }
                }
            }
            number[i] = names.length()-count;  
        }
        int max = number[0];
        for (int i = 0; i < number.length; i++) {
             if (number[i] > max)
                 max = number[i];
        }
        System.out.println(max);
        sc.close();
    }
}
