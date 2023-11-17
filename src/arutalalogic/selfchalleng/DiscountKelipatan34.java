/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.selfchalleng;

import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 */
public class DiscountKelipatan34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        double hargaBarang = scanner.nextDouble();
        int jumlahBarang = scanner.nextInt();

        //total harga dengan potongan
        double totalHarga = calculateTotalHarga(hargaBarang, jumlahBarang);

        // Tampilkan hasil
        System.out.printf("%.2f\n", totalHarga);
    }
    
     public static double calculateTotalHarga(double hargaBarang, int jumlahBarang) {
        //apakah jumlah barang merupakan kelipatan 3 dan 4
        boolean isKelipatanTiga = jumlahBarang % 3 == 0;
        boolean isKelipatanEmpat = jumlahBarang % 4 == 0;

        //total harga tanpa potongan
        double totalHarga = hargaBarang * jumlahBarang;

        // Jika jumlah barang merupakan kelipatan 3 dan 4, berikan potongan 15%
        if (isKelipatanTiga && isKelipatanEmpat) {
            double potongan = 0.15 * totalHarga;
            totalHarga -= potongan;
        }

        return totalHarga;
    }
}
