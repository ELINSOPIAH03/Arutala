/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.codingquiz;

import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 */
public class ParkirTujuhSembilan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        
        int kategori = scanner.nextInt();
        int lamaParkir = scanner.nextInt();
        
        if (kategori < 1 || kategori > 3) {
            System.out.println("Kategori harus antara 1 dan 3");
            return;
        }
        if (lamaParkir < 1 || lamaParkir > 24) {
            System.out.println("Lama parkir harus antara 1 dan 24");
            return;
        }

        // hitung biaya parkir
        int hasil = hitungBiayaParkir(kategori, lamaParkir);

        System.out.println(hasil);

        scanner.close();
    }

    public static int hitungBiayaParkir(int kategori, int lamaParkir) {
        // Tarif awal untuk setiap kategori
        int tarifAwal, tarifBerikutnya, maksimalBiaya;

        if (kategori == 1) { // Mobil
            tarifAwal = 5000;
            tarifBerikutnya = 2000;
            maksimalBiaya = 25000;
        } else if (kategori == 2) { // Motor
            tarifAwal = 2000;
            tarifBerikutnya = 1000;
            maksimalBiaya = 10000;
        } else if (kategori == 3) { // Box
            tarifAwal = 10000;
            tarifBerikutnya = 5000;
            maksimalBiaya = 50000;
        } else {
            return -1; // Kategori kendaraan tidak valid
        }

        // Hitung biaya parkir
        int biayaPertama = tarifAwal;
        int biayaBerikutnya = Math.max(0, lamaParkir - 1) * tarifBerikutnya;
        int totalBiaya = biayaPertama + biayaBerikutnya;

        // Biaya tidak boleh melebihi maksimalBiaya
        return Math.min(totalBiaya, maksimalBiaya);
    }
}