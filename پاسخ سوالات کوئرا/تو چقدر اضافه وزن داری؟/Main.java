import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
 
public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
 
        float WeightInKilograms = sc.nextFloat();
        float HeightInMeters = sc.nextFloat();
 
        if(WeightInKilograms < 1 || WeightInKilograms > 200)
            return;
 
        if(HeightInMeters < 1 || HeightInMeters > 10)
            return;
 
        float BMI = WeightInKilograms / (HeightInMeters * HeightInMeters);
 
        DecimalFormat df = new DecimalFormat("#.00");
        df.setRoundingMode(RoundingMode.CEILING);
 
        System.out.println(df.format((double) Math.round(BMI * 100) / 100));
 
        if(BMI < 18.5)
            System.out.println("Underweight");
        else if(BMI >= 18.5 && BMI < 25)
            System.out.println("Normal");
        else if(BMI >= 25 && BMI < 30)
            System.out.println("Overweight");
        else if(BMI > 30)
            System.out.println("Obese");
 
    }
}