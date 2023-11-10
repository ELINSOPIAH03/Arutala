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
public class hitungPrima {

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
        
        int jumlahBilanganPrima = 0;
        for (int i = 0; i < 10; i++) {
            if (isPrima(arrayX[i])) {
                jumlahBilanganPrima++;
            }
        }        
        System.out.println(jumlahBilanganPrima);
    }
    
    public static boolean isPrima(int n){
         if (n <= 1) {
            return false;
        }
         for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    
}
