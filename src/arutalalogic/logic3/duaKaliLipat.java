/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.logic3;

import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 */
public class duaKaliLipat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        if (X >= 0 && X <= 100) {
            X=X*2;
            System.out.println(X);
        } 
    }
    
}
