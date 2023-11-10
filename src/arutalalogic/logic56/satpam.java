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
public class satpam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
//        1. Kehilangan karcis motor
//        2. Tidak membawa STNK

        int pilihKasus = scanner.nextInt();
        int banyakKasus = scanner.nextInt();
        
        String tindakan = "";
        switch (pilihKasus) {
            case 1:
                if (banyakKasus < 4) {
                    tindakan = "Serahkan KTP anda !!!";
                } else {
                    tindakan = "Bayar Denda 10000 !!!";
                }
                break;
            case 2:
                tindakan = "Ambil STNK dulu !!!";
                break;
            default:
                tindakan = "Kasus tidak valid !!!";
                break;
        }
        System.out.println(tindakan);        
    }
}
