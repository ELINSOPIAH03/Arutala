/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic;

import java.util.Scanner;

/**
 *
 * @author elin
 */
public class test5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Masukkan harga barang dan jumlah barang:");
        double hargaBarang = scanner.nextDouble();
        int jumlahBarang = scanner.nextInt();

        // Menghitung total harga dengan potongan jika jumlah barang kelipatan 3 dan 4
        double totalHarga;
        if (jumlahBarang % 3 == 0 && jumlahBarang % 4 == 0) {
            double potongan = 0.15 * (hargaBarang * jumlahBarang);
            totalHarga = (hargaBarang * jumlahBarang) - potongan;
        } else {
            totalHarga = hargaBarang * jumlahBarang;
        }

        // Menampilkan total harga dengan dua angka di belakang koma
        System.out.printf("%.2f\n", totalHarga);
    }
    
}
