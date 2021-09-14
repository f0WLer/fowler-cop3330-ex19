import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alex Fowler
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your height in inches: ");
        double height = scanner.nextDouble();
        while (height <= 0) {
            height = scanner.nextDouble();
        }
        System.out.print("Enter your weight in pounds: ");
        double weight = scanner.nextDouble();
        while (weight <= 0) {
            weight = scanner.nextDouble();
        }
        double BMI = (weight / (height * height)) * 703;
        System.out.println(String.format("Your BMI is %.1f", BMI));

        if (BMI < 18.5) {
            System.out.println("You are underweight. You should see your doctor.");
        } else if (BMI > 25) {
            System.out.println("You are overweight. You should see your doctor.");
        } else {
            System.out.println("You are within the ideal weight range.");
        }
    }
}
