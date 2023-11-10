/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.logic10;

import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 */
public class pola2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Masukkan nilai: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int x = (int) Math.pow(2, i); 
            for (int j = 0; j <= i; j++) {
                System.out.print(x + " ");
                x /= 2; 
            }
            System.out.println();
        }        
        
    }
    
}
        
