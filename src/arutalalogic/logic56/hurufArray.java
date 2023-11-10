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
public class hurufArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        char huruf = input.toLowerCase().charAt(0);

        char[] X = {'p', 'a', 'd', 'e', 'p', 'o', 'k', 'a', 'n', '7', '9'};
        boolean ada = false;
        for (int i = 0; i < 10; i++) {
            if (X[i] == huruf) {
                    ada = true;
                    break;
            }
        }

        if (ada) {
            System.out.println("ada");
        } else {
            System.out.println("tidak ada");
        }
    }
    
}