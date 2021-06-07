/*
 *  UCF COP3330 Summer 2021 Assignment 18 Solution
 *  Copyright 2021 Julian Espinoza
 *
 *  Exercise 18 - Temperature Converter
 *  Create a program that converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit.
 *  Prompt for the starting temperature. The program should prompt for the type of conversion and then perform the conversion.
 *
 *  Constraint:
 *  Ensure that you allow upper or lowercase values for C and F.
 *  Use as few output statements as possible and avoid repeating output strings.
 *
 */

package ex18;
import java.util.Scanner;

public class base {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String [] args)
    {
        // Variable Initialization
        base myBase = new base();
        String mode = myBase.mode();
        int temperature = myBase.temperature(mode);
        // End calculations
        myBase.calculation(mode, temperature);
    }

    // Function returns the mode for the calculations
    public String mode()
    {
        String mode;
        System.out.printf("Press C to convert from Fahrenheit to Celsius. %nPress F to convert from Celsius to Fahrenheit.%n");
        System.out.printf("Your choice: ");

        // User Input Step
        mode = userInput.nextLine();

        // While statement ensures proper input
        while(!(mode.equals("C") || mode.equals("c") || mode.equals("F") || mode.equals("f")))
        {
            System.out.printf("Invalid mode, please enter another.%nYour choice: ");

            mode = userInput.nextLine();
        }

        return mode;
    }

    // Function returns the temperature
    public int temperature(String mode)
    {
        int temp;

        // User Input Step
        System.out.printf("Please enter the temperature in " + ((mode.equals("C") || mode.equals("c")) ? "Fahrenheit: " : "Celsius: "));
        temp = userInput.nextInt();

        return temp;
    }

    // Function converts the temperature into either fahrenheit or celsius
    public void calculation(String mode, int temperature)
    {
        int value;
        String variant;
        // Determination of conversion formula based on
        // User Input
        if(mode.equals("C") || mode.equals("c"))
        {
            value = ((temperature - 32) * 5) / 9;
            variant = "Celsius";
        }
        else
        {
            value = ((temperature * 9) / 5) + 32;
            variant = "Fahrenheit";
        }

        // Final Output
        System.out.printf("The temperature in " + variant + " is %d", value);
    }
}
