/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class tes3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan biaya awal:");
        double biayaAwal = scanner.nextDouble();
        System.out.println("Masukkan persen bunga:");
        double persenBunga = scanner.nextDouble();

        // Menghitung total biaya setelah bunga
        double totalBiaya = biayaAwal + (biayaAwal * (persenBunga / 100));

        // Menampilkan total biaya dengan dua angka di belakang koma
        System.out.printf("%.2f\n", totalBiaya);
    }
    
}
