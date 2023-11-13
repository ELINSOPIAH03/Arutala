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
public class tokoSembako {

    /**
     * @param args the command line arguments
     */
    private static final double labaNormal = 0.1;
    private static final double labaGood = 0.15;
    private static final double labaRec = 0.25;
    private static final double labaBestSell = 0.35;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahBarang = scanner.nextInt();

        for (int i = 0; i < jumlahBarang; i++) {
//            System.out.println("nama");
            String namaBarang = scanner.next();
            // Input label barang
            String labelBarang = scanner.next();
//            System.out.println("harga");
            int hargaProduksi = scanner.nextInt();

            // Hitung persentase laba
            int labaPercentage = (int) getLabaPercentage(labelBarang);

            // Hitung harga jual
            int hargaJual = (int) kalkulasiHargaJual(labaPercentage, hargaProduksi);

            // Cetak nama barang dan harga jual
            System.out.println(namaBarang);
            System.out.println(hargaJual);
        }
    }

    private static double getLabaPercentage(String labelBarang) {
        switch (labelBarang) {
            case "Normal":
                return labaNormal;
            case "Good":
                return labaGood;
            case "Recommended":
                return labaRec;
            case "Best Seller":
                return labaBestSell;
            default:
                throw new IllegalArgumentException("Label barang tidak valid");
        }
    }

    private static double kalkulasiHargaJual(double labaPercentage, double hargaProduksi) {
        return hargaProduksi * (1 + labaPercentage);
    }
}