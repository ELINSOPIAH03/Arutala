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
public class pola3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        if (N < 0 || N > 10) {
            System.out.println("N harus antara 1 dan 10");
            return;
        }
        int count = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

    }
    
}
