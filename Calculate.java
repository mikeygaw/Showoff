package mileskilometers;

import java.util.Scanner;

public class Calculate {
    public static void milesToKilometers() {
        Scanner inpt = new Scanner(System.in);
        
        //get number of miles from user and defines kilometers for conversion
        System.out.println("How many miles?");
        double miles = inpt.nextDouble();
        double kmperm = .62137;
        
        //calculates answer
        double km = miles/kmperm;
        
        //displays results
        System.out.println(miles + " miles are equal to " + km + " kilometers.");
    }
    
    public static void kilometersToMiles() {
        Scanner inpt = new Scanner(System.in);
        
        //get number of kilometeres from user and defines miles for conversion
        System.out.println("How many kilometeres?");
        double kilometeres = inpt.nextDouble();
        double mperkm=.62137;
        
        //calculate answer
        double miles = kilometeres * mperkm;
        
        //display results
        System.out.print(kilometeres + " kilometeres are equal to " + miles + " miles.");
    }
}
