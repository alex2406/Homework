package HomeworkJul.HomeworkJul29;

import java.util.Scanner;
class Bmi{
    public static void main(String[] args){
        Scanner input = new Scanner( System.in );

        System.out.println("Insert your height in feet");
        double userFeet = input.nextDouble();
        System.out.println("Insert your remaining height in Inches");
        double userInch = input.nextDouble();

        System.out.println("Insert your weight in pounds:");//60kg=132pounds
        double userPounds = input.nextDouble();
        double inches = userFeet * 12 + userInch;
        double meters = inches * 0.0254;
        double kilograms = userPounds / 2.2;
        double bmi = kilograms / ( meters * meters ) ;
                System.out.printf("Your height in meters: %.2f \n", meters);
                System.out.printf("Your weight in kilograms: %.2f\n", kilograms);
                System.out.printf("Your BMI: %.2f\n",bmi);

    }
}