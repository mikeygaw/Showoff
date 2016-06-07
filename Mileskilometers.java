/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mileskilometers;

import java.util.Scanner;

/**
 *
 * @author Mike
 */
public class Mileskilometers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter number to select option: ");
        System.out.println("1. Miles to kilometers");
        System.out.println("2. Kilometers to miles");

        Scanner input = new Scanner(System.in);
        int option = input.nextInt();

        if (option == 1) {
            Calculate mkm = new Calculate();
            mkm.milesToKilometers();
        } else if (option == 2){
            Calculate mkm = new Calculate();
            mkm.kilometersToMiles();
        } else {
            System.out.println("That option is not recognized.");
        }
    }

}
