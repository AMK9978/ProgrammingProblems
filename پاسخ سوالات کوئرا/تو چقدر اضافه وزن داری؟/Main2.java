

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        float m = sc.nextFloat();

        float BMI = n / (m*m);

        System.out.println(String.format("%.2f",BMI));

        if (BMI <18.5)
            System.out.println("Underweight");
        else if (BMI >= 18.5 & BMI <25)
            System.out.println("Normal");
        else if (BMI >= 25 & BMI <30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");


    }
}
