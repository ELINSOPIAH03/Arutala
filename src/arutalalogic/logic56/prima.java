/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.logic56;

import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 */
public class prima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        int X = scanner.nextInt();
        
        if(X < 2 ||  X > 32750){
            System.out.println("X harus antara 2 dan 32.750");
            return;
        }
        
        if (X == 2) {
            System.out.println("prima");
        } else if (X % 2 == 0) {
            System.out.println("bukan prima");
        } else {
            System.out.println("prima");
        }
        
    }
    
}
