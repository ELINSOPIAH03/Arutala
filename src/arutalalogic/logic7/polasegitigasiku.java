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
public class polasegitigasiku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        // Memeriksa batasan input
        if (N < 1 || N > 10) {
            System.out.println("Input tidak valid. Pastikan N berada dalam rentang 1 hingga 10.");
            return;
        }
        // Menampilkan pola
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
