/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.logic3;
import java.util.Scanner;
/**
 *
 * @author elin <_.arifaah>
 */
public class tengkiBensin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Masukkan uang yang dibayar (Rp): ");
        int uang = scanner.nextInt();

//        System.out.print("Masukkan kapasitas tangki bensin kendaraan: ");
        double kapasitasTangki = scanner.nextDouble();

        if (uang >= 7600 && uang <= 76000 && kapasitasTangki >= 1 && kapasitasTangki <= 10) {
            double hargaBensin = 7600;
            double jumlahBensin = uang / hargaBensin;

            System.out.printf("%.2f", jumlahBensin);

            if (jumlahBensin > kapasitasTangki) {
                System.out.println("\nBensin Berlebih");
            } 
        } else {
            System.out.println("\nInput tidak valid. Uang Tidak boleh <= 7600 dan >=76000 serta kapasitas tangki tidak boleh <=1 dan >=10");
        }
    }
    
}
