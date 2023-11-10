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
    
}
