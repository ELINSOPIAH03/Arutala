/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.logic2;

import java.util.Scanner;

/**
 *
 * @author elin
 */
public class bensinTagihan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membaca pilihan jenis bensin
        int jenisBensin = input.nextInt();

        // Membaca jumlah liter bensin yang dibeli
        double jumlahLiter = input.nextDouble();

        // Harga bensin per liter
        double hargaPerLiter = 0;

        if (jenisBensin == 1) {
            // Pertamax
            hargaPerLiter = 9000;
        } else if (jenisBensin == 2) {
            // Premium
            hargaPerLiter = 7600;
        }

        // Menghitung jumlah uang yang harus dibayar
        double totalHarga = hargaPerLiter * jumlahLiter;

        System.out.printf("%.2f\n", totalHarga);
    }    
}
