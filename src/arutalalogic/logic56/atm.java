/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.logic56;

import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 */
public class atm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Jumlah uang yang akan diambil: ");
        int jumlahUang = scanner.nextInt();
//
//        System.out.print("Saldo rekening Eva: ");
        double saldoRekening = scanner.nextDouble();

        double saldoSetelahTransaksi = hitungSaldoSetelahTransaksi(jumlahUang, saldoRekening);
        
        System.out.printf("%.2f\n", saldoSetelahTransaksi);

        scanner.close();
    }

    private static double hitungSaldoSetelahTransaksi(int jumlahUang, double saldoRekening) {
        double biayaTransaksi = 0.5;
        double totalBiaya = jumlahUang + biayaTransaksi;

        if (jumlahUang % 5 == 0 && saldoRekening >= totalBiaya) {
            return saldoRekening - totalBiaya;
        } else {
            return saldoRekening;
        }
    }
    
}
