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
public class bilBesar10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int[] arrayX = new int[10];
        for (int i = 0; i < 10; i++) {
            arrayX[i] = scanner.nextInt();
        }
        
        int bilTerbesar = arrayX[0];
        for (int i = 1; i < 10; i++) {
            if (arrayX[i] > bilTerbesar) {
                bilTerbesar = arrayX[i];
            }
        }
        
        System.out.println(bilTerbesar);
    }
    
}
