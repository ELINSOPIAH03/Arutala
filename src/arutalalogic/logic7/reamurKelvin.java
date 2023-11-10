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
public class reamurKelvin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        double R = scanner.nextDouble();
        
        if(R < -273 ||  R > 80){
            System.out.println("R harus antara -273 dan 80");
            return;
        }
        
        double K =  R * 1.25 + 273;
        System.out.printf("%.2f\n", K);
    }
    
}
