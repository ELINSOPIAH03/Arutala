/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.logic7;

import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 */
public class exbil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        double number = scanner.nextDouble();
        processNumber(number);

        scanner.close();
    }
    private static void processNumber(double number) {
        if (number >= 1.0 && number <= 1.5) {
            int roundedValue = (int) Math.round(number);
            System.out.println(roundedValue);
        } else {
            System.out.println(number);
        }
    }
    
}
