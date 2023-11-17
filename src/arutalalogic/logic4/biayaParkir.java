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
public class biayaParkir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int jenisKendaraan = input.nextInt();
        int lamaParkir = input.nextInt();
        
        if (lamaParkir < 0 || lamaParkir > 24) {
            System.out.println("Lama parkir tidakboleh lebih dari 24");
            return;
        }
        
        if (jenisKendaraan == 1) {
            int biayaParkir = 2000 + (lamaParkir - 1) * 1000;
            System.out.println(biayaParkir);
        } else if (jenisKendaraan == 2) {
            int biayaParkir = 1000 + (lamaParkir - 1) * 500;
            System.out.println(biayaParkir);
        } else {
            System.out.println("Jenis kendaraan tidak valid!");
        }
    }
    
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Menerima input kategori kendaraan
//        System.out.print("Masukkan kategori kendaraan (1: Mobil, 2: Motor, 3: Box): ");
//        int kategori = scanner.nextInt();
//        
//        if (kategori < 1 || kategori > 3) {
//            System.out.println("Kategori harus antara 1 sampai 3");
//        }
//
//        // Menerima input lama waktu parkir
//        System.out.print("Masukkan lama waktu parkir (jam): ");
//        int lamaParkir = scanner.nextInt();
//        
//        if (lamaParkir < 0 || lamaParkir > 24) {
//            System.out.println("Lama Parkir harus antara 0 sampai 24");
//        }
//
//        // Menghitung total biaya parkir
//        int totalBiaya = hitungBiayaParkir(kategori, lamaParkir);
//
//        // Menampilkan total biaya parkir
//        System.out.println(totalBiaya);
//    }
//
//    // Fungsi untuk menghitung biaya parkir
//    public static int hitungBiayaParkir(int kategori, int lamaParkir) {
//        int tarifAwal, tarifBerikutnya, maksimalBiaya;
//
//        // Menentukan tarif awal, tarif berikutnya, dan maksimal biaya sesuai kategori
//        if (kategori == 1) {
//            tarifAwal = 5000;
//            tarifBerikutnya = 2000;
//            maksimalBiaya = 25000;
//        } else if (kategori == 2) {
//            tarifAwal = 2000;
//            tarifBerikutnya = 1000;
//            maksimalBiaya = 10000;
//        } else if (kategori == 3) {
//            tarifAwal = 10000;
//            tarifBerikutnya = 5000;
//            maksimalBiaya = 50000;
//        } else {
//            System.out.println("Kategori kendaraan tidak valid.");
//            return 0;
//        }
//
//        // Menghitung total biaya parkir
//        int totalBiaya = tarifAwal + Math.min((lamaParkir - 1) * tarifBerikutnya, maksimalBiaya - tarifAwal);
//
//        return totalBiaya;
//    }
    
}
