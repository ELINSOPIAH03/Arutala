/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.logic4;

import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 */
public class luasLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double R = input.nextDouble();
        
        if (R < 0 || R > 100) {
            System.out.println("R harus antara 0 dan 100");
            return;
        }
        
        double L = 3.14*R*R;
        System.out.printf("%.2f\n", L);
    }
    
}
