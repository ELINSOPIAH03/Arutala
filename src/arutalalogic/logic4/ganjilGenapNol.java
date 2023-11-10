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
public class ganjilGenapNol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int X = input.nextInt();
        if (X < 0 || X > 100) {
            System.out.println("X harus antara 0 dan 100");
            return;
        }
        if(X == 0){
            System.out.println("nol");
            return;
        }if(X % 2 == 1){
            System.out.println("ganjil");
            return;
        }
        System.out.println("genap");
    }
    
}
