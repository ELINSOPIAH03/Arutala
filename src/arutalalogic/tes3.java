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
        
        if (biayaAwal < 0 || biayaAwal > 150000) {
            System.out.println("Biaya awal harus antara 0 sampai 15000");
        }
        
        System.out.println("Masukkan persen bunga:");
        double persenBunga = scanner.nextDouble();
        
        if (persenBunga < 0 || persenBunga > 100) {
            System.out.println("Persen bunga harus antara 0 sampai 100");
        }

        // Menghitung total biaya setelah bunga
        double totalBiaya = biayaAwal + (biayaAwal * (persenBunga / 100));

        // Menampilkan total biaya dengan dua angka di belakang koma
        System.out.printf("%.2f\n", totalBiaya);
    }
    
}
