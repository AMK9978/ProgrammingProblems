import java.util.Scanner;
 
class Main {
 
    static Scanner sc;
    static String strInput;
 
    public static void main(String[]args) {
        sc = new Scanner(System.in);
 
        int n = Integer.parseInt(sc.nextLine());
 
        if (n < 1 || n > 20)
            return;
 
        String[] inputNumbers = new String[n];
 
        int max_len = 0;
 
        for (int i = 1; i <= n; i++) {
            inputNumbers[i-1] = sc.nextLine();
 
            if(max_len < inputNumbers[i-1].length())
                max_len = inputNumbers[i-1].length();
        }
 
        String[][] myNumbers = new String[n][max_len];
        int j = 0;
 
        for (int i = 1; i <= n; i++) {
            for (j = 0; j < max_len; j++) {
                myNumbers[i-1][j] = "0";
            }
        }
 
        int temp_len = 0;
        for (int i = 1; i <= n; i++) {
            temp_len = inputNumbers[i-1].length();
            j = max_len - temp_len;
            for (char ch:inputNumbers[i-1].toCharArray()) {
                myNumbers[i-1][j] = String.valueOf(ch);
                j++;
            }
        }
 
        String sumNumbers = "";
        int sum = 0;
        int borrow = 0;
 
        for(j = max_len - 1; j >= 0; j--) {
            for (int i = 1; i <= n; i++) {
                sum += Integer.parseInt(myNumbers[i-1][j]);
            }
 
            sum += borrow;
            borrow = 0;
 
            if(sum > 9) {
                borrow = sum / 10;
                sum = sum - (borrow * 10);
            }
 
            sumNumbers = String.valueOf(sum) + sumNumbers;
            sum = 0;
        }
 
        if(borrow!=0) {
            max_len++;
            System.out.print(String.valueOf(borrow));
        }
 
        System.out.println(sumNumbers);
 
 
    }
 
}