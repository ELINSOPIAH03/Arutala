/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.logic8;

import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 */
public class pMalming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int jenisKendaraan = scanner.nextInt();
        int lamaParkir = scanner.nextInt();
        
        int biayaParkir = 0;
        if (jenisKendaraan == 1) {
            biayaParkir = lamaParkir * 1500;
            if (lamaParkir > 5) {
                biayaParkir += (lamaParkir - 5) * 500;
            }
        } else if (jenisKendaraan == 2) {
            biayaParkir = lamaParkir * 1000;
            if (lamaParkir > 5) {
                biayaParkir += (lamaParkir - 5) * 500;
            }
        } else {
            System.out.println("Jenis kendaraan tidak dikenal!");
            return;
        }

        if (lamaParkir > 8) {
            System.out.println("disegel");
            return;
        }

        System.out.println(biayaParkir);
    }
    
}
