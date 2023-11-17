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
public class TokoSembako {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahBarang = scanner.nextInt();
        scanner.nextLine(); // Membaca newline setelah jumlah barang

        for (int i = 0; i < jumlahBarang; i++) {
            String namaProduk = scanner.nextLine();
            String label = scanner.nextLine();
            double hargaProduksi = scanner.nextDouble();
            scanner.nextLine(); // Membaca newline setelah harga produksi

            double labaPercentage = getLabaPercentage(label);
            double hargaJual = kalkulasiHargaJual(labaPercentage, hargaProduksi);

            System.out.println(namaProduk);
            System.out.println((int) hargaJual); // output harga jual sebagai bilangan bulat
            System.out.print("\n");
        }
    }

    public static double getLabaPercentage(String labelBarang) {
        switch (labelBarang) {
            case "Best Seller":
                return 0.35;
            case "Recommended":
                return 0.25;
            case "Good":
                return 0.15;
            case "Normal":
                return 0.10;
            default:
                return 0.0;
        }
    }

    public static double kalkulasiHargaJual(double labaPercentage, double hargaProduksi) {
        return (1 + labaPercentage) * hargaProduksi;
    }
}
