/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.logic9;

import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 */
public class pujaseraPolban {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double jumlahHarga = scanner.nextDouble();
        int tanggalLahir = scanner.nextInt();
        
        if (jumlahHarga < 50000) {
            System.out.printf("%.2f", jumlahHarga);
            return;
        }
        double potonganHarga = 0.02 * tanggalLahir * jumlahHarga;

        double totalHarga = jumlahHarga - potonganHarga;
        System.out.printf("%.2f", totalHarga);
    }
    
}
