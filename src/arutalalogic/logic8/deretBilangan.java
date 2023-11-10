/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.logic8;

import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 */
public class deretBilangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Masukkan nilai suku pertama: ");
        int sukuPertama = scanner.nextInt();

//        System.out.println("Deret bilangan kelipatan tiga:");
        for (int i = 1; i <= 15; i++) {
            System.out.print(sukuPertama+" ");

            if (i % 3 == 1) {
                sukuPertama += 3;
            } else if (i % 3 == 2) {
                sukuPertama += 4;
            } else {
                sukuPertama += 5;
            }
        }

        scanner.close();
    }
}