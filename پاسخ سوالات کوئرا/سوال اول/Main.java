package com.example.idea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String one = sc.nextLine();
        String two = sc.nextLine();

        int repeat = StringInString(one,two);
        System.out.println(repeat);
        sc.close();
    }

    public static int StringInString(String one, String two) {
        int count =0;
        int lastIndex=0;
        if( one == null || two == null || one.equals("") || two.equals(""))
            return 0;
        while (lastIndex !=-1){
            lastIndex = one.indexOf(two, lastIndex);

            if (lastIndex != -1) {
                    count++;
                    lastIndex++;
                }
        }
        return count;
    }
}